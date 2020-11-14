package com.mrhan.privatenote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mrhan.privatenote.*")
public class PrivatenoteStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrivatenoteStarterApplication.class, args);
    }

}
