package com.cn.hnust.swagger;

import org.springframework.context.annotation.Bean;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
/*@Configuration
@EnableSwagger
@ComponentScan(basePackages = {"com.cn.hnust.controller","com.cn.hnust.pojo"})*/
public class SwaggerExtends  {
	public SpringSwaggerConfig getSpringSwaggerConfig() {
		return springSwaggerConfig;
	}
	public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
		this.springSwaggerConfig = springSwaggerConfig;
	}
	public SpringSwaggerConfig springSwaggerConfig;

	@Bean
	public SwaggerSpringMvcPlugin customImplmention(){
		return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(getApiInfo()).includePatterns(".*").useDefaultResponseMessages(false).apiVersion("1.0").swaggerGroup("user");
	}
	private ApiInfo getApiInfo(){
		return 	new ApiInfo("辰安科技业务软件平台", "提供业务基础软件平台的rest接口", "Copyright 2008 - 2012 Powered By dedecms", "辰安科技", "license辰安科技", "http://www.gsafety.com/");
	}
}
