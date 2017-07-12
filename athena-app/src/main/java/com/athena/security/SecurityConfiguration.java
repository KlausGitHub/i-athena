package com.athena.security;

import com.athena.service.CustomerUserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

import javax.annotation.Resource;

@Configuration
public class SecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

    @Resource
    private CustomerUserService userService;


    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }

}
