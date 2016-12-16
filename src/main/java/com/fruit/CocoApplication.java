package com.fruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CocoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CocoApplication.class, args);
    }
}
