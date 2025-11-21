package com.haddad.samesite;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Pour tester
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Tout permis pour les tests
                );
        return http.build();
    }
}
