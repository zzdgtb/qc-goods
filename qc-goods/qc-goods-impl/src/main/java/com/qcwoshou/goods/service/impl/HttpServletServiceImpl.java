package com.qcwoshou.goods.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

import static com.qcwoshou.core.common.constants.Constants.*;

/**
 * HttpServletRequest获取对应对象
 */
@Service
@Slf4j
public class HttpServletServiceImpl {

    @Autowired
    private HttpServletRequest requests;


    public String getToken() {
        return requests.getHeader(HEADER_TOKEN);
    }

    public String getTimestamp() {
        return requests.getHeader(HEADER_TIMESTAMP);
    }

    public String getRequestId() {
        return requests.getHeader(HEADER_REQUESTID);
    }

    public String getLoginId() {
        return requests.getHeader(HEADER_LOGINID);
    }

    public String getSign() {
        return requests.getHeader(HEADER_SIGN);
    }

    public String getChannelId() {
        return requests.getHeader(HEADER_CHANNELID);
    }
}
