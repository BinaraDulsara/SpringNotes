package lk.ijse.springenvironment;

import lk.ijse.springenvironment.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();



//        // System.env ---> Access to System Environment with JAVA
//
//        Map<String, String> getenv = System.getenv();
//        for (String key : getenv.keySet()) {
//            System.out.println (key+" : "+getenv.get(key));
//
//        }
//        System.out.println("---------------------------------------------------------------------");
//

        // System.getProperties ----> Access to Predefined Properties from JAVA
/*
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {

            System.out.println(key+" : "+ properties.get(key));

        }*/

       // String property = System.getProperty("os.version");
       // System.out.println(property);


    }
}
