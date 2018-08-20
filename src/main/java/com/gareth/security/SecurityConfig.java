package com.gareth.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("test").password("{noop}test").roles("USER").and()
                .withUser("root").password("{noop}root").roles("ADMIN");

    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
               .antMatchers("**/batsman/add").hasRole("ADMIN")
                .antMatchers("**/batsman/update").hasRole("ADMIN")
                .antMatchers("**/bowler/add").hasRole("ADMIN")
                .antMatchers("**/bowler/update").hasRole("ADMIN")
                .antMatchers("**/totalscore/add").hasRole("ADMIN")
                .antMatchers("**/totalscore/update").hasRole("ADMIN")
                .antMatchers("**/extras/add").hasRole("ADMIN")
                .antMatchers("**/extras/update").hasRole("ADMIN")
                .anyRequest()
                .fullyAuthenticated()
                .and().httpBasic();
       httpSecurity.csrf().disable();
    }


}
