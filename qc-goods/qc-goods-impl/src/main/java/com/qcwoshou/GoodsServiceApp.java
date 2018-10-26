package com.qcwoshou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.qcwoshou")
@SpringBootApplication
public class GoodsServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(GoodsServiceApp.class, args);
    }

}
