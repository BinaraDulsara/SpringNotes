package lk.ijse.configuration.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "lk.ijse.configuration.bean")
@Import({AppConfig1.class, AppConfig2.class})
public class AppConfig {

 }
