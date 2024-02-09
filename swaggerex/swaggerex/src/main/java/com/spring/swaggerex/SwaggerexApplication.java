package com.spring.swaggerex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;



@SpringBootApplication
//to apply security to swagger
@SecurityScheme(name="swagsecurity", scheme="basic", type=SecuritySchemeType.HTTP, in=SecuritySchemeIn.HEADER)
public class SwaggerexApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerexApplication.class, args);
	}

}
