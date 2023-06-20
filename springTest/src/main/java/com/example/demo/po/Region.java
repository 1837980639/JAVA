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
@ApiModel(value = "Region对象", description = "")
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("表id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("地区名称")
    private String name;

    @ApiModelProperty("地区等级 分省市县区")
    private Integer level;

    @ApiModelProperty("父id")
    private Integer parentId;


}
