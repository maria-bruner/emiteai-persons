package com.emiteai.person_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaAuditing
@EnableScheduling
@SpringBootApplication
public class PersonApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApiApplication.class, args);
	}

}
