package com.jqr.sso.exception;


import com.jqr.sso.po.ResultCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MyException extends  RuntimeException{
    @ApiModelProperty(value="返回码")
    private Integer code;
    @ApiModelProperty(value="返回信息")
    private String msg;
    @ApiModelProperty(value="返回数据")
    private Map<String,Object> data;
    // 注意这个构造方法，参数是刚刚我们定义的枚举类型
    public MyException(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }
    public MyException(ResultCode resultCode, Map<String,Object> data){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data=data;
    }

}
