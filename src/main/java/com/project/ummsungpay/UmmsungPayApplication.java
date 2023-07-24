package com.project.ummsungpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UmmsungPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(UmmsungPayApplication.class, args);
    }

}
