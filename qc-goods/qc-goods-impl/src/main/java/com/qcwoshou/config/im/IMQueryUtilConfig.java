package com.qcwoshou.config.im;

import com.qcwoshou.common.GoodsApiCode;
import com.qcwoshou.common.GoodsConstants;
import com.qcwoshou.common.TlsSigature;
import com.qcwoshou.exception.GoodsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

/**
 * @ClassName IMQueryUtilConfig
 * @Author wh
 * @Date 2018/10/30
 * @Version 1.0.0
 */
@Configuration
@Slf4j
public class IMQueryUtilConfig {

    @Bean
    public IMQueryUtil IMQueryUtil(){
        String querystr = "?sdkappid=" + GoodsConstants.IM_CONFIG.IM_SDKAPPID +
                "&identifier=" + GoodsConstants.IM_CONFIG.ADMINISTRATOR +
                "&usersig=" + getUserSig(GoodsConstants.IM_CONFIG.ADMINISTRATOR) +
                "&random=" + UUID.randomUUID().toString() +
                "&contenttype=json";
        return new IMQueryUtil(querystr);
    }


    private  String getUserSig(String userId) {
        log.info("视频模块-根据userID生成usersig--开始, 信息：{}", userId);
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
        log.info("视频模块-根据userID生成usersig--成功, 信息：{}", result.urlSig);
        return result.urlSig;
    }
}
