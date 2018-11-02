package com.qcwoshou.goods.model;

import java.util.Date;

public class PTransmit {
    private Long id;

    private Long userId;

    private String transmitCode;

    private Byte transmitType;

    private Integer destination;

    private Date createDate;

    private Date updateDate;

    private Byte isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTransmitCode() {
        return transmitCode;
    }

    public void setTransmitCode(String transmitCode) {
        this.transmitCode = transmitCode == null ? null : transmitCode.trim();
    }

    public Byte getTransmitType() {
        return transmitType;
    }

    public void setTransmitType(Byte transmitType) {
        this.transmitType = transmitType;
    }

    public Integer getDestination() {
        return destination;
    }

    public void setDestination(Integer destination) {
        this.destination = destination;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}