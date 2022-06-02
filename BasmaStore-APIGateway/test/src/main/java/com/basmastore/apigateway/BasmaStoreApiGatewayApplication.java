package com.basmastore.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.*;
import org.springframework.cloud.netflix.eureka.*;
import org.springframework.cloud.netflix.hystrix.*;

@SpringBootApplication

@EnableEurekaClient
@EnableHystrix
public class BasmaStoreApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasmaStoreApiGatewayApplication.class, args);
    }

}
