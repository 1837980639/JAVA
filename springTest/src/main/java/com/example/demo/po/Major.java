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
 * רҵ
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Getter
@Setter
@ApiModel(value = "Major对象", description = "רҵ")
public class Major implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("专业名称")
    private String majorName;

    @ApiModelProperty("专业描述")
    private String majorDesc;

    @ApiModelProperty("学院ID")
    private Integer departId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer deleted;

    private Integer schoolId;


}
