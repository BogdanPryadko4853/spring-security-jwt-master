package org.rest.security.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfig {


    public SecurityFilterChain securityFilterChain(final HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(registry -> registry
                        .requestMatchers("/api/auth/**").permitAll()
                                .anyRequest().authenticated()

                        );

        return http.build();

    }
}
