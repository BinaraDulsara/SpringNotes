package lk.ijse.fullmodelvslightmodel;

import lk.ijse.fullmodelvslightmodel.bean.MyConnection;
import lk.ijse.fullmodelvslightmodel.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();

        // context invocation added

        MyConnection bean = context.getBean(MyConnection.class);
        System.out.println(bean);


    }
}
