package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lukasz on 2017-09-24.
 */
@EnableAutoConfiguration
@SpringBootApplication
public class Start {
     public static void main(String[] args) throws Exception{
         SpringApplication.run(Start.class, args);
 }
}
