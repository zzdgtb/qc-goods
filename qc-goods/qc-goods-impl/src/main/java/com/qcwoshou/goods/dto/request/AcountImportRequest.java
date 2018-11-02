package com.qcwoshou.goods.dto.request;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * @ClassName AcountImportRequest
 * @Author wh
 * @Date 2018/10/30
 * @Version 1.0.0
 */
public class AcountImportRequest {

    @JsonProperty(value = "Accounts")
    private List<String> Accounts;

    @JsonIgnore
    public List<String> getAccounts() {
        return Accounts;
    }

    public void setAccounts(List<String> accounts) {
        Accounts = accounts;
    }
}
