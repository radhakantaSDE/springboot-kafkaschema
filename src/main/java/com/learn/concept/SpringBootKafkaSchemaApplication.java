package com.learn.concept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.learn.concept"})
public class SpringBootKafkaSchemaApplication {

	public static void main(String[] args) {

		// Starting of service
		SpringApplication.run(SpringBootKafkaSchemaApplication.class, args);
	}

}
