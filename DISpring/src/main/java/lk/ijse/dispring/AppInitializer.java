package lk.ijse.dispring;

import lk.ijse.dispring.bean.Boy;
import lk.ijse.dispring.config.AppConfig;
import lk.ijse.dispring.di.Kamal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();

/*        Boy boy = context.getBean(Boy.class);
        boy.chattingWithGirl();*/

      /*  Kamal kamal = context.getBean(Kamal.class);
        kamal.ChattingWithKamali();*/


    }
}
