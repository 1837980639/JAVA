package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * ����
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Getter
@Setter
@ApiModel(value = "Community对象", description = "����")
public class Community implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    @ApiModelProperty("ͨ0 通用社团 1专业社团")
    private Integer type;

    @ApiModelProperty("导师，社团必须有一个指导老师，教师编号如：1,13")
    private String teachers;

    @ApiModelProperty("学院编号")
    private Integer depart;

    @ApiModelProperty("团社logo")
    private String logo;

    @ApiModelProperty("团社会长")
    private Integer charger;

    @ApiModelProperty("团社介绍")
    private String description;

    @ApiModelProperty("0 未审核，1启用， 2终止")
    private Integer status;

    @ApiModelProperty("团社地址")
    private String address;

    @ApiModelProperty("团社电话")
    private String mobile;

    @ApiModelProperty("团社邮箱")
    private String email;

    @ApiModelProperty("团社公众号")
    private String weixin;

    @ApiModelProperty("学校")
    private Integer schoolId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    private Integer version;

    @ApiModelProperty("逻辑删除")
    private Integer deleted;


}
