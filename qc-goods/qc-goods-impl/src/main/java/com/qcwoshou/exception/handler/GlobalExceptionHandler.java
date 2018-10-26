package com.qcwoshou.exception.handler;

import com.qcwoshou.common.GoodsApiCode;
import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.exception.GoodsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author zhouzhiming
 * @Description //TODO
 * @Date 23:34 2018/10/23
 * @Param
 * @return
 **/
@ControllerAdvice(basePackages = {"com.qcwoshou.goods"})
@EnableWebMvc
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {

	
    /**
     * @Author zhouzhiming
     * @Description 处理参数校验失败异常
     * @Date 23:35 2018/10/23
     * @Param [request, exception]
     * @return com.qcwoshou.core.dto.result.BaseCommonResult
     **/
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public BaseCommonResult methodArgumentNotValidHandler(HttpServletRequest request, MethodArgumentNotValidException exception) {
        List<ObjectError> allErrors = exception.getBindingResult().getAllErrors();
        StringBuilder sb = new StringBuilder();
        for (ObjectError objectError : allErrors) {
            sb.append(objectError.getDefaultMessage()+",");
        }
        BaseCommonResult result = new BaseCommonResult(GoodsApiCode.PARAMS_CHECK_FAIL,GoodsApiCode.getZhMsg(GoodsApiCode.PARAMS_CHECK_FAIL)+":{"+sb+"}");
        log.info("请求失败(methodArgumentNotValidHandler),异常信息:{}",result.toString());
        return result;
    }

    /**
     * @Author zhouzhiming
     * @Description Get参数绑定失败
     * @Date 23:35 2018/10/23
     * @Param [request, exception]
     * @return com.qcwoshou.core.dto.result.BaseCommonResult
     **/
    @ExceptionHandler(value = BindException.class)
    public BaseCommonResult bindExceptionHandler(HttpServletRequest request, BindException exception) {
        List<ObjectError> allErrors = exception.getBindingResult().getAllErrors();
        StringBuilder sb = new StringBuilder();
        for (ObjectError objectError : allErrors) {
            sb.append(objectError.getDefaultMessage()+",");
        }
        BaseCommonResult result = new BaseCommonResult(GoodsApiCode.PARAMS_CHECK_FAIL,GoodsApiCode.getZhMsg(GoodsApiCode.PARAMS_CHECK_FAIL)+":{"+sb+"}");
        log.info("请求失败(bindExceptionHandler),异常信息:{}",result.toString());
        return result;
    }
    
    
    /**
     * @Author zhouzhiming
     * @Description Get参数绑定失败
     * @Date 23:36 2018/10/23
     * @Param [request, exception]
     * @return com.qcwoshou.core.dto.result.BaseCommonResult
     **/
    @ExceptionHandler(value = HttpMessageConversionException.class)
    public BaseCommonResult httpMessageConversionHandler(HttpServletRequest request, HttpMessageConversionException exception) {
    	log.info("商品信息-请求处理失败：{}",exception);
    	return new BaseCommonResult(GoodsApiCode.FAIL,"请求参数绑定失败(请检查字段名称、类型、格式等)");
    }
    
    /**
     * @Author zhouzhiming
     * @Description 处理交易服务业务类异常
     * @Date 23:36 2018/10/23
     * @Param [exception]
     * @return com.qcwoshou.core.dto.result.BaseCommonResult
     **/
    @ExceptionHandler(value = GoodsException.class)
    public BaseCommonResult goodsException(GoodsException exception) {
        return new BaseCommonResult(exception.getResponseCode(), exception.getResponseMsg());
    }

    /**
     * @Author zhouzhiming
     * @Description 处理默认异常
     * @Date 23:37 2018/10/23
     * @Param [exception]
     * @return com.qcwoshou.core.dto.result.BaseCommonResult
     **/
    @ExceptionHandler(value = Exception.class)
    public BaseCommonResult defaultHandlerExceptionResolverHandler(Exception exception) {
    	log.info("商品信息-请求处理失败：{}",exception);
    	return new BaseCommonResult(GoodsApiCode.FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.FAIL));
    }

}
