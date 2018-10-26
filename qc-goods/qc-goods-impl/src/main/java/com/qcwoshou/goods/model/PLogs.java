package com.qcwoshou.goods.model;

import java.util.Date;

public class PLogs {
    private Long id;

    private Date createtime;

    private Byte logsLevel;

    private Byte systemSource;

    private String elapsedTime;

    private String operatorId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getLogsLevel() {
        return logsLevel;
    }

    public void setLogsLevel(Byte logsLevel) {
        this.logsLevel = logsLevel;
    }

    public Byte getSystemSource() {
        return systemSource;
    }

    public void setSystemSource(Byte systemSource) {
        this.systemSource = systemSource;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime == null ? null : elapsedTime.trim();
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }
}