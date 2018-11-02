package com.qcwoshou.common;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;

/**
 * @ClassName Result
 * @Author wh
 * @Date 2018/10/31
 * @Version 1.0.0
 */
@ApiModel(value="返回类")
public class Result<T> implements Serializable {
    private static final Logger log = LoggerFactory.getLogger(Result.class);
    private static final long serialVersionUID = 6558724517240247655L;
    @ApiModelProperty("返回状态码 默认成功:10000")
    private Integer code = Integer.valueOf(10000);
    @ApiModelProperty("返回消息 默认成功:成功")
    private String msg = "成功";
    @ApiModelProperty("返回数据")
    private T data;

    public Result() {
    }

    public Result(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + this.subClassToString() + "}";
    }

    public String subClassToString() {
        StringBuilder sb = new StringBuilder();

        try {
            Class e = this.getClass();
            BeanInfo beanInfo = Introspector.getBeanInfo(e);
            PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
            PropertyDescriptor[] var5 = pds;
            int var6 = pds.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                PropertyDescriptor pd = var5[var7];
                String name = pd.getName();
                if(!"class".equals(name)) {
                    Object value = pd.getReadMethod().invoke(this, new Object[0]);
                    sb.append(name + "=").append("\'").append(value).append("\',");
                }
            }
        } catch (Exception var11) {
            log.error("subClassToString出错:{}", var11);
        }

        sb.replace(sb.length() - 1, sb.length(), "");
        return sb.toString();
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }
    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        } else if(!(o instanceof Result)) {
            return false;
        } else {
            Result other = (Result)o;
            if(!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Integer this$code = this.getCode();
                    Integer other$code = other.getCode();
                    if(this$code == null) {
                        if(other$code == null) {
                            break label47;
                        }
                    } else if(this$code.equals(other$code)) {
                        break label47;
                    }

                    return false;
                }

                String this$msg = this.getMsg();
                String other$msg = other.getMsg();
                if(this$msg == null) {
                    if(other$msg != null) {
                        return false;
                    }
                } else if(!this$msg.equals(other$msg)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if(this$data == null) {
                    if(other$data != null) {
                        return false;
                    }
                } else if(!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseCommonResult;
    }
    @Override
    public int hashCode() {
        boolean PRIME = true;
        byte result = 1;
        Integer $code = this.getCode();
        int result1 = result * 59 + ($code == null?0:$code.hashCode());
        String $msg = this.getMsg();
        result1 = result1 * 59 + ($msg == null?0:$msg.hashCode());
        Object $data = this.getData();
        result1 = result1 * 59 + ($data == null?0:$data.hashCode());
        return result1;
    }
}
