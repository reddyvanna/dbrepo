package com.springboot.prometheus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootandPrometheusApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootandPrometheusApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootandPrometheusApplication.class, args);
        LOGGER.info("Springboot and Prometheus application is started successfully.");
    }

}
