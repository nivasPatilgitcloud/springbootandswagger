package com.spring.swaggerex.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info = @Info(
				title = "Nivas Patil Products and Service API Documentation",
				description = "Performing Product CRUD (Create,Read,Update,Delete).",
				termsOfService = "T&C",
				contact = @Contact(
						name="Swagger springdoc-openapi",
						url="https://springdoc.org/#getting-started",
						email="nivaspatil0750@gmail.com"
				),
				version="v1"
		),
		servers = {
			@Server(
					description ="Dev Environment",
					url = "http://localhost:8080/"
				),
			@Server(
					description ="UAT Environment",
					url="http://localhost:8081/"
			)
		}
)
public class OpenApiConfig {

}
