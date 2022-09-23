package com.example.aop2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Base64;

@SpringBootApplication
public class Aop2Application {

    public static void main(String[] args) {

        SpringApplication.run(Aop2Application.class, args);
        System.out.println(Base64.getEncoder().encodeToString("steve@naver.com".getBytes()));
    }

}
