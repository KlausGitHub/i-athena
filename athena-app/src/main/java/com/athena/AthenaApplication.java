package com.athena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("classpath:beanRefContext.xml")
@ComponentScan(basePackages = {"com.athena"})
public class AthenaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AthenaApplication.class, args);
    }


}
