package com.qcwoshou.goods.dto.request;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @ClassName DestroyGroupRequest
 * @Author wh
 * @Date 2018/10/30
 * @Version 1.0.0
 */
public class DestroyGroupRequest {
    @JsonProperty(value = "GroupId")
    private String GroupId = "";

    @JsonIgnore
    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
    }
}
