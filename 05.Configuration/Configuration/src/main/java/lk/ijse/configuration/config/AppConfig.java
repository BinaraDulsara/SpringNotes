package lk.ijse.configuration.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.configuration.bean")

// There are two ways to configure,
//                                1.annotation
//                                2.xml
//@Import({AppConfig1.class, AppConfig2.class}) // we can import configuration into a single class
//@ImportResource("file:absolute-path-of-abcd.xml") // we can use this annotation to import xml Configurations to the context

public class AppConfig {

 }
