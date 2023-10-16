package lk.ijse.springenvironment;

import lk.ijse.springenvironment.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appinitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();

    }
}
