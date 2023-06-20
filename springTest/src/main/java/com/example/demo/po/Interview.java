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
 * 面试题
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Getter
@Setter
@ApiModel(value = "Interview对象", description = "面试题")
public class Interview implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("试面题")
    private String title;

    @ApiModelProperty("面试题型解析")
    private String analysis;

    @ApiModelProperty("面试题型")
    private Integer interviewType;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer deleted;

    private Integer userinfoId;


}
