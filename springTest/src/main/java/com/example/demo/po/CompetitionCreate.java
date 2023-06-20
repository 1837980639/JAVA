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
@TableName("competition_create")
@ApiModel(value = "CompetitionCreate对象", description = "")
public class CompetitionCreate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户编号，比赛负责人")
    private Integer userId;

    @ApiModelProperty("竞赛标题：互联网+院赛")
    private String title;

    @ApiModelProperty("竞赛方案")
    private String content;

    @ApiModelProperty("竞赛开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty("结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty("开始报名：1 报名 0未报名")
    private Integer signup;

    @ApiModelProperty("赛事对象：比如：全校；学院，专业")
    private String target;

    @ApiModelProperty("赛事类型：个人赛,团队赛")
    private String type;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @ApiModelProperty("逻辑删除")
    private Integer deleted;

    @ApiModelProperty("目标赛事,该竞赛作为某个竞赛的预选赛，如果为0，没有目标赛事")
    private Integer aimCompetition;

    @ApiModelProperty("状态：0未启用，1启用，2结束 ")
    private Integer state;

    @ApiModelProperty("审核：1 已审核，0 未审核")
    private Integer checked;

    @ApiModelProperty("学校编号")
    private Integer schoolId;


}
