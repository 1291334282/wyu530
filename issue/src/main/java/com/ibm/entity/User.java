package com.ibm.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户实体类")
public class User {
	@ApiModelProperty("用户id")
	private Integer userID;
	@ApiModelProperty("角色id")
	private Integer roleID;
	@ApiModelProperty("用户名")
	private String name;
	@ApiModelProperty("邮箱")
	private String email;
	@ApiModelProperty("密码")
	private String password;
}
