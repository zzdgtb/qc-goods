package com.qcwoshou.goods.service;

import java.util.List;

/**
 * @ClassName IMService
 * @Author admin
 * @Date 2018/10/30
 * @Version 1.0.0
 */
public interface IMService {

    public void acountImport(List<Integer> userIdlist);
    /**
     * 建群
     * @param groupID
     * @return
     */
    public boolean createGroup(String groupID,String groupName,String userId);

    /**
     * 解散群
     * @param groupID
     */
    public void destroyGroup(String groupID);
}
