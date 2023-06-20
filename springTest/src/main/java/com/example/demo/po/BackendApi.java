package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Getter
@Setter
@TableName("backend_api")
@ApiModel(value = "BackendApi对象", description = "")
public class BackendApi implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("API名称")
    private String apiName;

    @ApiModelProperty("API请求地址")
    private String apiUrl;

    @ApiModelProperty("API请求方式：GET、POST、PUT、DELETE")
    private String apiMethod;

    @ApiModelProperty("父ID")
    private Integer pid;

    @ApiModelProperty("排序")
    private Integer apiSort;

    @ApiModelProperty("描述")
    private String description;


}
