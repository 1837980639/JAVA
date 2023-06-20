package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@TableName("competition_signup")
@ApiModel(value = "CompetitionSignup对象", description = "")
public class CompetitionSignup implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("学生编号")
    private Integer studentId;

    @ApiModelProperty("竞赛编号")
    private Integer competitionId;

    @ApiModelProperty("报名竞赛时间")
    private LocalDateTime createTime;

    @ApiModelProperty("审核，1 已审核，0 未审核")
    private Integer checked;


}
