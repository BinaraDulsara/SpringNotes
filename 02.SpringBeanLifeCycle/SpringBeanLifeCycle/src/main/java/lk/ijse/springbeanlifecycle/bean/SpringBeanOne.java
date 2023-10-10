package lk.ijse.springbeanlifecycle.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*@Scope("prototype")*/
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanOne() {
        System.out.println("Spring bean one created ");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name aware called");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory aware called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context aware called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanOne is Destroyed ");
    }
}
