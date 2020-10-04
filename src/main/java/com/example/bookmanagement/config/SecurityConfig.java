package com.example.bookmanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableAuthorizationServer
public class SecurityConfig extends
        AuthorizationServerConfigurerAdapter {/*
                                               * @Override protected void configure(HttpSecurity http) throws Exception
                                               * { http . csrf().disable()
                                               * .authorizeRequests().anyRequest().authenticated() .and() .httpBasic();
                                               * }
                                               * 
                                               * @Autowired public void configureGlobal(AuthenticationManagerBuilder
                                               * auth) throws Exception { auth.inMemoryAuthentication()
                                               * .withUser("admin") .password("admin") .roles("ADMIN"); }
                                               */
}