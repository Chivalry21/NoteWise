//package com.chivalry.note;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.HttpSecurityDsl;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class NoteSecurityConfig extends AbstractHttpConfigurer<NoteSecurityConfig, HttpSecurity> {
//    @Override
//    public void configure(HttpSecurity httpSecurity) throws Exception {
//        HttpSecurity
//
//                .antMatchers("/note/save").authenticated()
//                .antMatchers("/note/get").authenticated()
//                .antMatchers("/note/login").permitAll()
//                .and()
//                .formLogin()
//                .loginPage("/note/login")
//                .defaultSuccessUrl("/note/get")
//                .and()
//                .logout()
//                .logoutSuccessUrl("/note/login?logout")
//                .permitAll();
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//
//}
