package com.basmastore.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.*;

@SpringBootApplication
@EnableEurekaServer
public class BasmaStoreMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasmaStoreMsApplication.class, args);
    }

}
