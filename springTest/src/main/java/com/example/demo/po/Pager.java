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
 * 试卷
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Getter
@Setter
@ApiModel(value = "Pager对象", description = "试卷")
public class Pager implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("论文题目")
    private String name;

    @ApiModelProperty("论文类型：科技类，教改类，其他")
    private String type;

    @ApiModelProperty("作者")
    private Integer userId;

    @ApiModelProperty("刊物")
    private String publication;

    @ApiModelProperty("发表时间")
    private String publishTime;

    @ApiModelProperty("刊物种类：核心期刊，国际会议，SCI，EI，本科学报")
    private String publicationCate;

    @ApiModelProperty("引用次数")
    private Integer count;

    @ApiModelProperty("佐证材料，图片，压缩包")
    private String attachment;


}
