package com.rimi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@SpringBootApplication
@EnableAspectJAutoProxy
public class RimiLiveApplication {
    public static void main(String[] args) {
        SpringApplication.run(RimiLiveApplication.class, args);
    }
}
