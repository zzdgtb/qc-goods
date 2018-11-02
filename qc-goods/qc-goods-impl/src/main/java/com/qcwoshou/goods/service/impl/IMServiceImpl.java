package com.qcwoshou.goods.service.impl;

import com.qcwoshou.common.*;
import com.qcwoshou.config.im.IMQueryUtil;
import com.qcwoshou.exception.GoodsException;
import com.qcwoshou.goods.dao.ImGroupMapper;
import com.qcwoshou.goods.dto.request.AcountImportRequest;
import com.qcwoshou.goods.dto.request.CreateGroupRequest;
import com.qcwoshou.goods.dto.request.DestroyGroupRequest;
import com.qcwoshou.goods.model.ImGroup;
import com.qcwoshou.goods.service.IMService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName IMServiceImpl
 * @Author wh
 * @Date 2018/10/30
 * @Version 1.0.0
 */
@Service
@Slf4j
public class IMServiceImpl implements IMService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private IMQueryUtil iMQueryUtil;
    @Autowired
    private ImGroupMapper imGroupMapper;

    @Override
    public void acountImport(List<Integer> userIdlist) {
        log.info("视频模块-IM账号导入--开始, 请求信息：{}", userIdlist);
        ResponseEntity<String> response = null;
        try{
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(GoodsConstants.IM_HOST + "v4/im_open_login_svc/multiaccount_import" + iMQueryUtil.getQueryStr());

            AcountImportRequest req = new AcountImportRequest();
            List<String> userIdstrList = new ArrayList<String>();
            for(Integer userId:userIdlist){
                userIdstrList.add(userId.toString());
            }
            req.setAccounts(userIdstrList);

            HttpEntity<String> entity = new HttpEntity<String>(Utils.objectToString(req), headers);

            response = restTemplate.exchange(
                    builder.build().encode().toUri(),
                    HttpMethod.POST,
                    entity,
                    String.class);
        }catch(Exception e){
            log.info("视频模块-IM账号导入--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.IM_ACOUNT_IMPORT_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.IM_ACOUNT_IMPORT_FAIL));
        }
        if (null == response || response.getStatusCode().value() != HttpStatus.OK.value()) {
            log.info("视频模块-IM账号导入--失败, 信息：{}", response.toString());
            throw new GoodsException(GoodsApiCode.IM_ACOUNT_IMPORT_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.IM_ACOUNT_IMPORT_FAIL));
        }
        log.info("视频模块-IM账号导入--成功, 信息：{} ", response.toString());
    }

    @Override
    public boolean createGroup(String groupID,String groupName,String userId) {
        log.info("视频模块-创建群组--开始, 请求信息：{}", groupID);
        ResponseEntity<String> response = null;
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(GoodsConstants.IM_HOST + "v4/group_open_http_svc/create_group" + iMQueryUtil.getQueryStr());
            CreateGroupRequest req = new CreateGroupRequest();
            req.setOwner_Account(userId);
            req.setGroupId(groupID);
            req.setName(groupName);
            req.setType(GoodsConstants.IM_GROUP_TYPE.AV_CHAT_ROOM.type);
            HttpEntity<String> entity = new HttpEntity<String>(Utils.objectToString(req), headers);
            response = restTemplate.exchange(
                    builder.build().encode().toUri(),
                    HttpMethod.POST,
                    entity,
                    String.class);
            if (null == response || response.getStatusCode().value() != HttpStatus.OK.value()) {
                log.info("视频模块-创建群组--失败, 信息：{}", response.toString());
                throw new GoodsException(GoodsApiCode.IM_CREATE_GROUP_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.IM_CREATE_GROUP_FAIL));
            }
            ImGroup group = new ImGroup();
            group.setCreateDate(DateUtil.getNow());
            group.setGroupCode(groupID);
            group.setOwnerAccount(userId);
            group.setOwnerAccountId(new Integer(userId));
            group.setName(groupName);
            imGroupMapper.insertSelective(group);
        } catch (Exception e) {
            log.info("视频模块-创建群组--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.IM_CREATE_GROUP_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.IM_CREATE_GROUP_FAIL));
        }
        log.info("视频模块-创建群组--成功, 信息：{} ", response.toString());
        return true;
    }

    private String getQueryString() {
        String query = "?sdkappid=" + GoodsConstants.IM_CONFIG.IM_SDKAPPID +
                "&identifier=" + GoodsConstants.IM_CONFIG.ADMINISTRATOR +
                "&usersig=" + getUserSig(GoodsConstants.IM_CONFIG.ADMINISTRATOR) +
                "&random=" + UUID.randomUUID().toString() +
                "&contenttype=json";
        return query;
    }

    private String getUserSig(String userId) {
        TlsSigature.GenTLSSignatureResult result = null;
        try {
            result = TlsSigature.GenTLSSignatureEx(GoodsConstants.IM_CONFIG.IM_SDKAPPID, userId, GoodsConstants.IM_CONFIG.PRIVATEKEY, 30 * 24 * 60 * 60);
        } catch (Exception e) {
            log.info("视频模块-根据userID生成usersig--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.IM_USERSIG_CREATE_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.IM_USERSIG_CREATE_FAIL));
        }

        if (0 == result.urlSig.length()) {
            log.info("视频模块-根据userID生成usersig--失败, 信息：{}", result.errMessage);
            throw new GoodsException(GoodsApiCode.IM_USERSIG_CREATE_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.IM_USERSIG_CREATE_FAIL));
        }
        return result.urlSig;
    }

    @Override
    public void destroyGroup(String groupID) {
        log.info("视频模块-销毁群组--开始, 请求信息：{}", groupID);
        ResponseEntity<String> response = null;
        try{
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(GoodsConstants.IM_HOST + "v4/group_open_http_svc/destroy_group" + iMQueryUtil.getQueryStr());

            DestroyGroupRequest req = new DestroyGroupRequest();
            req.setGroupId(groupID);

            HttpEntity<String> entity = new HttpEntity<String>(Utils.objectToString(req), headers);

            response = restTemplate.exchange(
                    builder.build().encode().toUri(),
                    HttpMethod.POST,
                    entity,
                    String.class);
        }catch(Exception e){
            log.info("视频模块-销毁群组--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.IM_DESTROY_GROUP_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.IM_DESTROY_GROUP_FAIL));
        }
        if (null == response || response.getStatusCode().value() != HttpStatus.OK.value()) {
            log.info("视频模块-销毁群组--失败, 信息：{}", response.toString());
            throw new GoodsException(GoodsApiCode.IM_DESTROY_GROUP_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.IM_DESTROY_GROUP_FAIL));
        }
        log.info("视频模块-销毁群组--成功, 信息：{} ", response.toString());
    }
}
