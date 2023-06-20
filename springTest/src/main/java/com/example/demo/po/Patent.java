package com.example.demo.po;

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
@ApiModel(value = "Patent对象", description = "")
public class Patent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty("专利名称")
    private String name;

    @ApiModelProperty("发明人：排位第一人")
    private Integer userId;

    @ApiModelProperty("专利类型：发明专利，实用新型专利，外观设计")
    private String type;

    @ApiModelProperty("授权时间")
    private LocalDateTime empowerTime;

    @ApiModelProperty("佐证材料")
    private String attachment;


}
