package com.imbbc.graphql.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GraphqlDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GraphqlDemoApplication.class, args);
	}
}
