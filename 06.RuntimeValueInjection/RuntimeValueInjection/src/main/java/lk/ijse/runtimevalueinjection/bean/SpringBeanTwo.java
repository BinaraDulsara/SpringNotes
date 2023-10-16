package lk.ijse.runtimevalueinjection.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBeanTwo implements InitializingBean {
    @Value("C001")
    private String id;

    @Value("binara")
    private String name;

    @Value("wadduwa")
    private String address;

    @Value("20000")
    private double salary;

    public SpringBeanTwo() {
        System.out.println("SpringBeanTwo instantiated");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("-----------------------------------------");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);

    }
}


