package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
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
@ApiModel(value = "School对象", description = "")
public class School implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("省")
    private String province;

    private String city;

    @ApiModelProperty("市|县")
    private String area;

    @ApiModelProperty("学校名称")
    private String schoolName;

    private String latitude;

    private String longitude;

    @ApiModelProperty("0 未启用 1启用")
    private BigDecimal enable;

    @ApiModelProperty("学校说明")
    private String description;

    private String address;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer deleted;


}
