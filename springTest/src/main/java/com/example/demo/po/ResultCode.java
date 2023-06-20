package com.example.demo.po;

public enum ResultCode implements CostomizeRsultcode {
	
	
	SUCCESS(1,"成功"),
	FAILURE(0,"失败"),
	NODATA(2,"没有数据"),
	NOID(3,"编号没有值"),
	FILE_UPLOAD_SUCCESS(4,"文件上传成功"),

	//参数错误1000-1999
	PARAM_NOT_VALID(1001,"参数无效"),
	PARAM_IS_BLANK(1002,"参数为空"),
	PARAM_TYPE_ERROR(1003,"参数类型错误"),
	PARAM_NOT_COMPLETE(1004,"参数缺失"),
	VALIDATED_ERROR(1005,"数据校验失败"),
	DEPARTNAME_IS_REPEAT(1006,"部门名称重复"),
	ROLENAME_IS_REPEAT(1007,"角色重复"),
	MENUNAME_IS_REPEAT(1008,"菜单重复"),
	COURSENAME_IS_REPEAT(1009,"课程重复"),
	COURSNO_IS_REPEAT(1010,"课程编号重复"),
	CLASSINFONAME_IS_REPEAT(1011,"班级重复"),
	BUILDINGNAME_IS_REPEAT(1012,"建筑重复"),
	IMGURL_IS_REPEAT(1013,"图片路径重复"),
	STUDENTNO_IS_REPEAT(1014,"学生学号重复"),
	TEACHERNO_IS_REPEAT(1015,"教师工号重复"),
	EXCEL_IS_NULL(1006,"EXCEL为空"),
	XLSX_IS_REQUIRED(1007,"EXCEL文件扩展名必须为xlsx,xls"),
	UPLOAD_DATA_DUPLICATE(1008,"上传数据已存在"),
	DEPARTMENT_IS_NOT_EXIST(1009,"部门存在"),
	VERIFYCODE_IS_ERROR(1010,"验证码输入错误"),
	//用户错误2001-2999
	USERNAME_IS_REPEAT(2001,"用户账号重复"),
	PASSWORD_IS_EMPTY(2002,"用户密码不能为空"),
	USERNAME_AND_PASSWORD_IS_EMPTY(2003,"用户账号或者密码不能为空"),
	USERNAME_AND_PASSWORD_IS_ERROR(2004,"用户账号或者密码错误"),
	TOKEN_NOT_VALIDATE(2005,"token验证错误,请重新登录"),
	STUDENT_TEACHER_NOTIN_SCHOOL(2006,"对不起你的信息不存在，请联系管理员"),
	USER_SIGNUPED_COMPETITION(2007,"你已经报名了该竞赛项目"),
	//业务错误4000-5000
	NO_PERMISSTION(40001,"没有权限"),
	FILE_IS_BLANK(40002,"文件为空"),


	VALIDATOR_ERROR(40003,"服务端验证失败"),
	CACHE_REQUIRED_ID(40004,"缓存需要编号"),
	CACHE_SET_FAILURE(40005,"缓存写入失败"),

	CACHE_GET_FAILURE(40006,"缓存读取失败"),
	CACHE_DEL_FAILURE(40007,"缓存删除失败"),
	CACHE_EMPTY_FAILURE(40007,"缓存清空失败"),
	IMAGE_IS_BLANK(40008,"图片为空"),
	IMAGETYPE_IS_NOT_SUPPORT(40009,"此图片格式不支持，目前系统支持的格式:jpg,jpeg,png,gif,bmp"),
	SYSTEM_ERROR(500,"系统内部错误,请联系管理员")
	;
	
	private Integer code;
	
	private String msg;
	
	

	private ResultCode(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	@Override
	public Integer getCode() {
		// TODO Auto-generated method stub
		return this.code;
	}

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return msg;
	}

	
	
	

	

	

}
