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
@ApiModel(value = "Userinfo对象", description = "")
public class Userinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户账号")
    private String userName;

    @ApiModelProperty("码密")
    private String password;

    @ApiModelProperty("学生,教师,教学辅助,管理员,后勤")
    private String userType;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @ApiModelProperty("标记删除")
    private Integer deleted;

    @ApiModelProperty("状态 1激活 0未激活")
    private Integer state;

    private String token;

    @ApiModelProperty("绑定：学生,教师,教辅,后勤1绑定 0 未绑定")
    private Integer binding;


}
