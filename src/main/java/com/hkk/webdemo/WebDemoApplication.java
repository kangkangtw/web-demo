package com.hkk.webdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hkk.webdemo.mapper")
public class WebDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebDemoApplication.class, args);
  }

}
