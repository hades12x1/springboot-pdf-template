package com.springhow.examples.springboot.pdfdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@ServletComponentScan
@SpringBootApplication
public class PdfDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PdfDemoApplication.class, args);
    }

}
