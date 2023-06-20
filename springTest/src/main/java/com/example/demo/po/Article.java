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
 * 
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Getter
@Setter
@ApiModel(value = "Article对象", description = "")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("文章id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户文章编号id")
    private Integer userArticleCatId;

    @ApiModelProperty("文章标题")
    private String title;

    @ApiModelProperty("章文内容")
    private String content;

    private LocalDateTime updateTime;

    @ApiModelProperty("建创时间")
    private LocalDateTime createTime;

    @ApiModelProperty("逻辑删除")
    private Integer deleted;

    @ApiModelProperty("课程编号")
    private Integer courseId;

    @ApiModelProperty("是否公开 1，公开，0 私有，默认1")
    private Integer open;


}
