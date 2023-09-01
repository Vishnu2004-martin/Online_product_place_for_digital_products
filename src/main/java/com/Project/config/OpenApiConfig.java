package com.Project.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info = @Info(
			contact = @Contact(
					name="Vishnu J",
					email="vishnu @gmail.com",
					url="https://some-url.com"
			),
			description = "This is open api documentation for digital_Products",
			title = "DigitalProducts",
			version = "1.0",
			license = @License(
					name="MIT",
					url="https://some-url.com"
					),
			termsOfService = "Terms of Service"
			),
		servers = @Server(
				description = "DEV ENV ",
				url="https://some-url.com"
				)
		
			
			
			
		
	)
public class OpenApiConfig {

}
