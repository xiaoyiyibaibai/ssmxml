package com.cn.hnust.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RequestParam;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;  
  /**
   * 用于测试spring security使用。
   * @author xiaodonghong
   *
   * 2016年10月12日 上午10:53:50
   */
@Controller  
@RequestMapping(value= "/auth") 
@Api(description="登录和退出处理类",value="/auth")
public class LoginLogoutController {  
    protected static Logger logger = LoggerFactory.getLogger(LoginLogoutController.class);  
  
    /** 
     * 指向登录页面 
     * http://localhost:8080/springmvc/auth/login?error=false
     */  
    @ApiOperation(value="用户登录" ,notes="登录用户标示",httpMethod="GET")
    @RequestMapping(value = "/login", method = RequestMethod.GET)  
    public String getLoginPage(  
           @ApiParam(value="是否报错",required=true) @RequestParam(value = "error") boolean error,  
            ModelMap model) {  
  
        logger.debug("Received request to show login page");  
  
        if (error == true) {  
            // Assign an error message  
            model.put("error",  
                    "You have entered an invalid username or password!");  
        } else {  
            model.put("error", "");  
        }  
        return "loginpage";  
  
    }  
    
    /** 
     * 指向登录页面 
     */  
    @RequestMapping(value = "/loginAction", method = RequestMethod.POST)  
    public String getLoginAction(  
    		@RequestParam(value = "error") boolean error,  
    		ModelMap model) {  
    	
    	logger.debug("Received request to show login page");  
    	
    	if (error == true) {  
    		// Assign an error message  
    		model.put("error",  
    				"You have entered an invalid username or password!");  
    	} else {  
    		model.put("error", "");  
    	}  
    	return "loginpage";  
    	
    }  
  
    /** 
     * 指定无访问额权限页面 
     *  
     * @return 
     */  
    @RequestMapping(value = "/denied", method = RequestMethod.GET)  
    public String getDeniedPage() {  
  
        logger.debug("Received request to show denied page");  
  
        return "deniedpage";  
  
    }  
    /** 
     * 错误页面
     *  
     * @return 
     */  
    @RequestMapping(value = "/error", method = RequestMethod.GET)  
    public String getErrorPage() {  
    	
    	logger.debug("Received request to show error page");  
    	
    	return "hello";  
    	
    }  
}  