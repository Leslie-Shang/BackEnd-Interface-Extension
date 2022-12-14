package com.leslie.demo.entity;

import com.leslie.demo.annotation.ExceptionCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Leslie
 * @description 用户实体类
 */
@Data
@ApiModel("用户")
public class User {
    @ApiModelProperty("用户id")
    @NotNull(message = "用户id不能为空")
    private Long id;

    @ApiModelProperty("用户账号")
    @NotNull(message = "用户账号不能为空")
    @Size(min = 6, max = 11, message = "账号长度必须是6-11个字符")
    @ExceptionCode(value = 100001, message = "账号验证错误")
    private String account;

    @ApiModelProperty("用户密码")
    @NotNull(message = "用户密码不能为空")
    @Size(min = 6, max = 11, message = "密码长度必须是6-16个字符")
    @ExceptionCode(value = 100002, message = "密码验证错误")
    private String password;

    @ApiModelProperty("用户邮箱")
    @NotNull(message = "用户邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    @ExceptionCode(value = 100003, message = "邮箱验证错误")
    private String email;
}
