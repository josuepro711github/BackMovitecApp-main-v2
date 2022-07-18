package com.movitec.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MovitectBackAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovitectBackAppApplication.class, args);
		/*
		EnviarGmail a = new EnviarGmail();
		
		a.enviar();
		*/
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
				registry.addMapping("/auth/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
}
