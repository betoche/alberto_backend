package com.alberto.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.alberto.backend")
@EnableJpaRepositories("com.alberto.backend.repositories")
@EntityScan("com.alberto.backend.entities")
public class DemoApplication {
   
    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
