package com.utc.format.transformer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        CorsRegistration corsRegistration = registry
                .addMapping("/**")
                .allowedMethods("GET", "PUT", "POST", "DELETE", "OPTIONS");
        corsRegistration.allowedOrigins("*");
    }

}
