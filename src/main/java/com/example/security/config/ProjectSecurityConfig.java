package com.example.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((request) -> request
//                .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
//                .requestMatchers("/notices", "/contact").permitAll())
//                .formLogin(Customizer.withDefaults())
//                .httpBasic(Customizer.withDefaults());

        http.authorizeHttpRequests((request) -> request.anyRequest().denyAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
