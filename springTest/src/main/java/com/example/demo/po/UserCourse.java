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
@TableName("user_course")
@ApiModel(value = "UserCourse对象", description = "")
public class UserCourse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户")
    private Integer userinfoId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer deleted;

    @ApiModelProperty("程课编号集合1，2，3，4")
    private String courseIds;

    @ApiModelProperty("学年：2022-2023学年")
    private String year;

    @ApiModelProperty("学期：第一学期，第二学期")
    private byte[] term;


}
