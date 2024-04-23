package com.winner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class MainServer {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainServer.class, args);
        new CountDownLatch(1).await();
    }
}
