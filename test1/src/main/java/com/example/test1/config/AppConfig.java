package com.example.test1.config;

import com.example.test1.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    public AppConfig() {
        System.out.println("app config object created ");
    }

    @Bean
    public MyConnection getConnection(){
        return new MyConnection();
    }
}
