package com.example.note.HomeLane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
import javax.annotation.PostConstruct;
import java.util.TimeZone;
*/

@SpringBootApplication
public class HomeLaneApplication extends SpringBootServletInitializer {

/*
	@PostConstruct
	public void init(){
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
	}
*/

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HomeLaneApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(HomeLaneApplication.class, args);
	}

}

