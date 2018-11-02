package com.qcwoshou.goods.dto.request;


import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @ClassName CreateGroupRequest
 * @Author wh
 * @Date 2018/10/30
 * @Version 1.0.0
 */
public class CreateGroupRequest {
    @JsonProperty(value = "Owner_Account")
    private String Owner_Account;
    @JsonProperty(value = "Type")
    private String Type = "";
    @JsonProperty(value = "GroupId")
    private String GroupId = "";
    @JsonProperty(value = "Name")
    private String Name = "";

    @JsonIgnore
    public String getOwner_Account() {
        return Owner_Account;
    }

    public void setOwner_Account(String owner_Account) {
        Owner_Account = owner_Account;
    }

    @JsonIgnore
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @JsonIgnore
    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
    }

    @JsonIgnore
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
