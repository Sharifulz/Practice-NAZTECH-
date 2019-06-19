package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplications extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplications.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(SpringBootApplications.class);
	}
}
