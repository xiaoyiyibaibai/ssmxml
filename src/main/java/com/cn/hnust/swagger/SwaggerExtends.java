package com.cn.hnust.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
/*@Configuration
@EnableSwagger
@ComponentScan(basePackages = {"com.cn.hnust.controller","com.cn.hnust.pojo"})*/
public class SwaggerExtends  {
	@Autowired
	public SpringSwaggerConfig springSwaggerConfig;

	@Bean
	public SwaggerSpringMvcPlugin customImplmention(){
		return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(getApiInfo()).includePatterns(".").includePatterns(".*").useDefaultResponseMessages(false).apiVersion("1.0").swaggerGroup("user");
	}
	private ApiInfo getApiInfo(){
		return 	new ApiInfo("辰安科技业务软件平台", "提供业务基础软件平台的rest接口", "Copyright 2008 - 2012 Powered By dedecms", "辰安科技", "", "http://www.gsafety.com/");
	}
}
