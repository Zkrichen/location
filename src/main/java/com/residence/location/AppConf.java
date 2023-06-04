package com.residence.location;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConf implements WebMvcConfigurer {
	@Value( "${web.cors.allowed-origins}" )
	private String webCrossOrigin;
	
	@Value( "${web.cors.allowed-methods}" )
	private String webALlowMethods;
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins(webCrossOrigin).allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS");             
    }
}