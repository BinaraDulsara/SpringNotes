package lk.ijse.springbeanlifecycle.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanTwo() {
        System.out.println("SpringBeanTwo Created");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanTwo Factory Aware Caled");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("SpringBeanTwo Name Aware Called");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanTwo Destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanTwo Initialized Called");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanTwo Application Aware Called");
    }
}
