package com.imbbc.graphql.demo.controller;

import com.imbbc.graphql.demo.model.User;
import com.imbbc.graphql.demo.service.UserService;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//@GraphQLApi
//@Component
public class UserController {

    @Autowired
    private UserService userService;

    @GraphQLQuery(name = "users")
    public List<com.imbbc.graphql.demo.model.User> getAllUsers() {
        return userService.findAll();
    }

    @GraphQLMutation
    public com.imbbc.graphql.demo.model.User upsertUser(@GraphQLArgument(name = "user") User user) {
        return userService.save(user);
    }
}


