package com.example.test1;

import com.example.test1.bean.MyConnection;
import com.example.test1.bean.SpringBean;
import com.example.test1.bean.SpringBean1;
import com.example.test1.bean.SpringBean2;
import com.example.test1.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.registerShutdownHook();

         ctx.register(AppConfig.class);
         ctx.refresh();

         /*Class Type request*/

        /*SpringBean bean = ctx.getBean(SpringBean.class);
        System.out.println(bean);

        SpringBean1 bean1 = ctx.getBean(SpringBean1.class);
        System.out.println(bean1);

        SpringBean2 bean2 = ctx.getBean(SpringBean2.class);
        System.out.println(bean2);*/

        /*Bean name request(BeanId)*/

        /*SpringBean springBean = (SpringBean) ctx.getBean("springBean");
        System.out.println(springBean);*/

        /*MyConnection bean = ctx.getBean(MyConnection.class);
        System.out.println(bean);

        Object getConnection = ctx.getBean("getConnection");
        System.out.println(getConnection); */

        SpringBean ref1 = ctx.getBean(SpringBean.class);
        SpringBean ref2 = ctx.getBean(SpringBean.class);
        SpringBean ref3 = ctx.getBean(SpringBean.class);

        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref3);

    }
}
