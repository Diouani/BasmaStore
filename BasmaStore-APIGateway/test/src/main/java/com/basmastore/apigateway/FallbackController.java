package com.basmastore.apigateway;


import org.springframework.boot.context.properties.*;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.*;

@RestController
@EnableConfigurationProperties
public class FallbackController {
    @RequestMapping("/orderFallBack")
    public Mono<String> orderServiceFallBack() {
        return Mono.just("order service is not available");
    }

    @RequestMapping("paymentFallBack")
    public Mono<String> paymentServiceFallBack() {
        return Mono.just("payment service is not available");
    }
}
