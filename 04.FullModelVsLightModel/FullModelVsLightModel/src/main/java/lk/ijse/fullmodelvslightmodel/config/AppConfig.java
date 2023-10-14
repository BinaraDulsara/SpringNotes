package lk.ijse.fullmodelvslightmodel.config;

import lk.ijse.fullmodelvslightmodel.bean.SpringBeanOne;
import lk.ijse.fullmodelvslightmodel.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.fullmodelvslightmodel")
public class AppConfig {

    @Bean
    public SpringBeanOne getBeanOne(){

        // InterBean Dependency

        SpringBeanTwo bean = getBeanTwo();
        SpringBeanTwo beanTwo = getBeanTwo();

        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getBeanTwo(){
        return new SpringBeanTwo();
    }


}
