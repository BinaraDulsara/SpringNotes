package lk.ijse.springbeanlifecycle;

import lk.ijse.springbeanlifecycle.bean.SpringBeanOne;
import lk.ijse.springbeanlifecycle.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

/*        SpringBeanOne bean1 = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean1);
        SpringBeanOne bean2 = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean2);*/


    }
}
