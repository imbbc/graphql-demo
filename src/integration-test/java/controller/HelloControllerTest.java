package controller;

import com.imbbc.graphql.demo.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloControllerTest {

    @Autowired
    UserService userService;

    @Test
    public void hello() {
        System.out.println("Jaideb Ho");
    }
}