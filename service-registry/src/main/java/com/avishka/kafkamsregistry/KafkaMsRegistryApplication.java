package com.avishka.kafkamsregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KafkaMsRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaMsRegistryApplication.class, args);
    }

}
