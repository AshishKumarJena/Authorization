package com.cognizant.authorization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AuthorizationServiceApplication {
	private static final Logger log = LoggerFactory.getLogger(AuthorizationServiceApplication.class);
	public static void main(String[] args) {
		
		log.debug("START");
		SpringApplication.run(AuthorizationServiceApplication.class, args);
		log.debug("END");
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("GET", "PUT", "POST", "DELETE", "OPTIONS");
			}
		};
	}

}
