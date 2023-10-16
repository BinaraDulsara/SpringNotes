package lk.ijse.springenvironment.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements InitializingBean {
    @Value("${os.version}")
    private String osName;


    public SpringBeanOne() {
        System.out.println("SpringBeanOne Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
    }
}
