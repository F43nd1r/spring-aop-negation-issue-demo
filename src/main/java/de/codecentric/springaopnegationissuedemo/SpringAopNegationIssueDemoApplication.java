package de.codecentric.springaopnegationissuedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringAopNegationIssueDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopNegationIssueDemoApplication.class, args);
    }

}
