package com.qcwoshou.goods.model;

public class PLogsWithBLOBs extends PLogs {
    private String bizProcess;

    private String messageRes;

    private String request;

    private String response;

    public String getBizProcess() {
        return bizProcess;
    }

    public void setBizProcess(String bizProcess) {
        this.bizProcess = bizProcess == null ? null : bizProcess.trim();
    }

    public String getMessageRes() {
        return messageRes;
    }

    public void setMessageRes(String messageRes) {
        this.messageRes = messageRes == null ? null : messageRes.trim();
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }
}