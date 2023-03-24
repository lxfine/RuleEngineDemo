package com.example.ruleenginedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:urule-console-context.xml")
@SpringBootApplication
public class RuleEngineDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RuleEngineDemoApplication.class, args);
    }

}
