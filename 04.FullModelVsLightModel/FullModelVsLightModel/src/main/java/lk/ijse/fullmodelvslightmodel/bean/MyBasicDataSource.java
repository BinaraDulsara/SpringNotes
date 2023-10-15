package lk.ijse.fullmodelvslightmodel.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBasicDataSource implements BeanNameAware, BeanFactoryAware , ApplicationContextAware , InitializingBean , DisposableBean {
    public MyBasicDataSource() {
        System.out.println("MyBasicDataSource instantiated");
    }

     MyConnection connection;

    public void setMyConnection(MyConnection connection){
        this.connection = connection;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyBasicDataSource Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("MyBasicDataSource Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyBasicDataSource Disposable Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyBasicDataSource  Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyBasicDataSource Application context Aware");
    }
}
