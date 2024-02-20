package com.inventory.gateway.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig{
	
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
        .authorizeHttpRequests(authorizeRequests ->
            authorizeRequests
                .anyRequest().authenticated()
        )
        .logout(logout -> logout
            .logoutSuccessUrl("/").permitAll()
        )
        .oauth2Login(null);
		return http.build();
	}
}


