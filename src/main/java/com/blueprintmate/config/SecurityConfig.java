package com.blueprintmate.config;

import com.blueprintmate.filter.JwtValidatorFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Autowired
    ApplicationContext applicationContext;

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(request -> request
                        .requestMatchers("/register").permitAll()
                        .requestMatchers("/login").permitAll()
                        .requestMatchers("/client/create").hasRole("USER")
                        .requestMatchers("/client/find").hasRole("ADMIN")
                        .requestMatchers("/client/find/all").hasRole("ADMIN")
                        .requestMatchers("/client/delete/**").hasRole("ADMIN")
                        .requestMatchers("/form/create").hasRole("USER")
                        .requestMatchers("/form/update/**").hasRole("USER")
                        .requestMatchers("/form/find/all").hasRole("USER")
                        .requestMatchers("/form/delete").hasRole("USER")
                        .requestMatchers("/form/filter").hasRole("ADMIN")
                        .requestMatchers("/form/admin/delete").hasRole("ADMIN"))
                .addFilterBefore(applicationContext.getBean(JwtValidatorFilter.class), UsernamePasswordAuthenticationFilter.class)
                .httpBasic(Customizer.withDefaults())
                .formLogin(AbstractHttpConfigurer::disable);

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails userDetails = User.builder()
                .username("root")
                .password("123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }
}
