package com.projetoestagio.portalestagiosapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // desativa proteção CSRF (para testes)
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // permite todos os acessos sem login
            );
        return http.build();
    }
}
