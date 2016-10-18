package com.cn.hnust.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
@Configuration  
@EnableWebSecurity
public class WebSecurityConfigurerAdapterExtends extends WebSecurityConfigurerAdapter  {
	/*@Autowired
	private void configureGlobalSecurity(AuthenticationManagerBuilder auth ) throws Exception {*/

		/*	<security:authentication-manager>
		<security:authentication-provider>
			<!-- 1.基础用户 -->
			<security:user-service>

				<security:user name="xiao" password="abc" authorities="ROLE_USER" />
			</security:user-service>
		</security:authentication-provider>
	</security:authentication-manager>*/
/*		auth.inMemoryAuthentication().withUser("xiao").password("123").roles("ROLE_ADMIN","DBA");
		auth.inMemoryAuthentication().withUser("dong").password("123").roles("ROLE_ADMIN");
	}*/
	
	
	@Autowired  
    @Qualifier("customUserDetailsService")  
    UserDetailsService userDetailsService;  
       
    @Autowired  
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {  
        //auth.userDetailsService(userDetailsService);  
        auth.userDetailsService(userDetailsService);
    }  
}