package com.example.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@ImportResource({ "classpath:/META-INF/spring/spring-security.xml",
	"classpath:/META-INF/spring/applicationContext.xml", })
@EnableRedisHttpSession
public class Bootstrap extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Bootstrap.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Bootstrap.class, args);
	}
    @Bean
    public JedisConnectionFactory connectionFactory() {
            return new JedisConnectionFactory();
    }
}