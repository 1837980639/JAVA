package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value = "Competition对象", description = "")
public class Competition implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("竞赛名称")
    private String name;

    @ApiModelProperty("竞赛内容")
    private String content;

    @ApiModelProperty("竞赛官网")
    private String homePage;

    @ApiModelProperty("竞赛类型：个人赛,团体赛")
    private String type;

    @ApiModelProperty("竞赛等级：国际级,国家级，省级，市级，校级，院级")
    private String rank;

    @ApiModelProperty("学校")
    private Integer schoolId;

    @ApiModelProperty("主办单位：比如教育部")
    private String organizer;

    @ApiModelProperty("开始时间")
    private String start;

    @ApiModelProperty("结束时间")
    private String end;


}
