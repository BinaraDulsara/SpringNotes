package lk.ijse.fullmodelvslightmodel.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class MyConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public MyConnection() {
        System.out.println(" MyConnection Instantiated ");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyConnection Factory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("MyConnection Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection Disposable Aware");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConnection Initializing Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyConnection Application Context Aware");
    }
}
