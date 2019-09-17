package com.lc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan
public class FinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalApplication.class, args);
    }

}
