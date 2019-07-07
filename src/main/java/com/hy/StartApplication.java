package com.hy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*

植树造法

*/
@SpringBootApplication
@MapperScan("com.hy.mapper")

public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class);

    }
}
