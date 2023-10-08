package lk.ijse.dispring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component

public class Boy implements BeanNameAware, BeanFactoryAware , ApplicationContextAware, InitializingBean , DisposableBean {

    /*@Autowired // property injection
    Girl girl ;*/

    @Qualifier("girlOne")
    @Autowired
    GoodGirl girl ;

    public Boy() {
        System.out.println("BOY Instantiated");
    }

    public void chattingWithGirl(){
//        System.out.println("from boy === " +this.girl);
          girl.chat();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Boy Bean Factory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("boy Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Boy Disposable Bean Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Boy Initializing Bean Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Boy ApplicationContextAware");
    }
}
