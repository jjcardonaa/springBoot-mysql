package com.springboot.microservices.demo.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.RequestHandlerProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class MainJpaMysqlApplication implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(MainJpaMysqlApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MainJpaMysqlApplication.class, args);

	}
	
	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors
				.basePackage("com.springboot.microservices.demo.controller")).build();
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Hola codder desde springboot");
	}
}
