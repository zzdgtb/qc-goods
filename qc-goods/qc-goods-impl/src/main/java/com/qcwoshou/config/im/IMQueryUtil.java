package com.qcwoshou.config.im;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @ClassName IMQueryUtil
 * @Author wh
 * @Date 2018/10/30
 * @Version 1.0.0
 */
@Data
@Component
public class IMQueryUtil {

    private String queryStr;

    public IMQueryUtil(String queryStr){
        this.queryStr=queryStr;
    }

}
