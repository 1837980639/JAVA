package com.example.demo.po;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result implements Serializable {
	@ApiModelProperty(value="返回是否成功")
	private boolean success;
	@ApiModelProperty(value="返回码")
    private Integer code;
	@ApiModelProperty(value="返回信息")
    private String msg;
	@ApiModelProperty(value="返回数据")
    private Map<String,Object> data;
	
	
	public static Result ok() {
		Result result=new Result();
		result.setSuccess(true);
		result.setMsg(ResultCode.SUCCESS.getMsg());
		result.setCode(ResultCode.SUCCESS.getCode());
		return result;
	}
	public static Result ok(Map<String,Object> data) {
		Result result=new Result();
		result.setSuccess(true);
		result.setMsg(ResultCode.SUCCESS.getMsg());
		result.setCode(ResultCode.SUCCESS.getCode());
		result.setData(data);
		return result;
	}

	public static Result error() {

		Result result=new Result();
		result.setSuccess(false);
		result.setMsg(ResultCode.FAILURE.getMsg());
		result.setCode(ResultCode.FAILURE.getCode());
		return result;
	}
	
	public static Result error(ResultCode resultCode) {
		
		Result result=new Result();
		result.setSuccess(false);
		result.setMsg(resultCode.getMsg());
		result.setCode(resultCode.getCode());
		return result;
	}
	public static Result error(ResultCode resultCode,Map<String,Object> data) {

		Result result=new Result();
		result.setSuccess(false);
		result.setMsg(resultCode.getMsg());
		result.setCode(resultCode.getCode());
		result.setData(data);
		return result;
	}
	public Result msg(String msg){
		this.setMsg(msg);
		return  this;

	}
	public Result code(Integer code){
		this.setCode(code);
		return this;
	}
	public Result data(Map<String,Object> data){
		if(data==null){
			this.setData(null);
			return this;
		}
		else {
			this.setData(data);
			return this;
		}

	}
}
