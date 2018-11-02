package com.qcwoshou.goods.model;

import java.util.Date;

public class ImGroup {
    private Integer id;

    private String groupCode;

    private Date createDate;

    private Date modifyDate;

    private String name;

    private String ownerAccount;

    private Integer ownerAccountId;

    private Boolean isNeedAuth;

    private Short authType;

    private Byte isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode == null ? null : groupCode.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount == null ? null : ownerAccount.trim();
    }

    public Integer getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(Integer ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    public Boolean getIsNeedAuth() {
        return isNeedAuth;
    }

    public void setIsNeedAuth(Boolean isNeedAuth) {
        this.isNeedAuth = isNeedAuth;
    }

    public Short getAuthType() {
        return authType;
    }

    public void setAuthType(Short authType) {
        this.authType = authType;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}