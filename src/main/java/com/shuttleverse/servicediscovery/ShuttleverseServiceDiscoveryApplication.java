package com.shuttleverse.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShuttleverseServiceDiscoveryApplication {

  public static void main(String[] args) {
    SpringApplication.run(ShuttleverseServiceDiscoveryApplication.class, args);
  }

}
