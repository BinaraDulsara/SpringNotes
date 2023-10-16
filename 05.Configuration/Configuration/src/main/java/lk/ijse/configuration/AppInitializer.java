package lk.ijse.configuration;

import lk.ijse.configuration.config.AppConfig;
import lk.ijse.configuration.config.AppConfig1;
import lk.ijse.configuration.config.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.register(AppConfig1.class);
        context.register(AppConfig2.class);
        context.refresh();
        context.registerShutdownHook();


    }
}
