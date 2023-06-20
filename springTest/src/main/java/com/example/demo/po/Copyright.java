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
@ApiModel(value = "Copyright对象", description = "")
public class Copyright implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("著作权名称")
    private String name;

    @ApiModelProperty("著作权人：第一位")
    private Integer userId;

    @ApiModelProperty("完成时间")
    private LocalDateTime finishTime;

    @ApiModelProperty("首次发表时间")
    private LocalDateTime publishTime;

    @ApiModelProperty("佐证材料")
    private String attachment;


}
