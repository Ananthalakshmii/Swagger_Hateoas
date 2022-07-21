package com.accolite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2    // http://localhost:8080/swagger-ui/ --- to enable automatic documentation
public class SwaggerHateoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerHateoasApplication.class, args);
	}

}

