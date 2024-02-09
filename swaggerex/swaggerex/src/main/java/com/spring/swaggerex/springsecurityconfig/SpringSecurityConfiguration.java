package com.spring.swaggerex.springsecurityconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http
	        .csrf().disable() // For testing with Postman or similar; be cautious about disabling CSRF in production.
	        .authorizeRequests()
	            .antMatchers("/swagger-ui/**", "/v3/api-docs/**", "/swagger-resources/**").permitAll()
	            .antMatchers("/product/update").authenticated()
	            .antMatchers("/product/save").authenticated()
	            .antMatchers("/product/delete").authenticated()
	            .antMatchers("/product/list").authenticated() // Requires authentication
	            .anyRequest().permitAll()
	        .and()
	        .httpBasic();
	}



	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("nivaspatil")
			.password(passwordEncoder().encode("nivaspatil"))
			.authorities("ADMIN");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
