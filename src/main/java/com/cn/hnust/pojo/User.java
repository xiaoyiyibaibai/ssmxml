package com.cn.hnust.pojo;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
/**
 * @ApiModel，表示实体类注释，value表示对象名称，description表示描述
@ApiModeProperty，表示描述字段的注释，value表示字段名,required表示是否必填。

 * @author xiaodonghong
 *
 * 2016年10月20日 上午9:15:31
 */
@ApiModel(value="用户对象",description="用户对象")
public class User {
	@ApiModelProperty(value="唯一表示",required=true)
	private Integer id;
	@ApiModelProperty(value="用户名",required=true)
	private String userName;
	@ApiModelProperty(value="密码",required=true)
	private String password;
	@ApiModelProperty(value="年龄")
	private Integer age;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}