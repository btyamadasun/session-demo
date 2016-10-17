package com.example.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

//@ImportResource({ "classpath:/META-INF/spring/spring-security.xml",
//	"classpath:/META-INF/spring/applicationContext.xml", })
public class Bootstrap extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Bootstrap.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Bootstrap.class, args);
	}
}