package com.imbbc.graphql.demo.repo;

import com.imbbc.graphql.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
