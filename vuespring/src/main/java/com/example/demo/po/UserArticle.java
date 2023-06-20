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
 * @author 秦坤
 * @since 2023-03-05
 */
@Getter
@Setter
@TableName("user_article")
@ApiModel(value = "UserArticle对象", description = "")
public class UserArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户编号")
    private Integer userId;

    @ApiModelProperty("文章编号")
    private Integer articleId;

    @ApiModelProperty("逻辑删除")
    private Integer deleted;

    private String usertype;


}
