package com.imbbc.graphql.demo.config;

import com.imbbc.graphql.demo.controller.HelloController;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class Config {

    @Bean
    @GraphQLApi
    public HelloController helloController() {
        return new HelloController();
    }
}
