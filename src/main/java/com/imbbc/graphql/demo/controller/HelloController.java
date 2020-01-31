package com.imbbc.graphql.demo.controller;

import io.leangen.graphql.annotations.GraphQLQuery;

public class HelloController {

    @GraphQLQuery
    public String hello() {
        return "Hello from Awesome world!";
    }
}
