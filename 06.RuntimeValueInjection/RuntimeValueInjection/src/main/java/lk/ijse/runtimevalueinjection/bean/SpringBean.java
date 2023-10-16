package lk.ijse.runtimevalueinjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean {

    @Autowired(required = false)
    public SpringBean(@Value("C001") String id,@Value("20") int age ,@Value("true") boolean b ) {
        System.out.println("SpringBean instantiated");
        System.out.println(id);
        System.out.println(age);
        System.out.println(b);
    }

    @Autowired(required = false)
    public SpringBean(@Value("1,2,3 ") int [] myNames ,@Value("A") char a) {
        System.out.println("SpringBean instantiated");
        for (int myName : myNames) {
            System.out.println(myName);
        }
        System.out.println(a);

        }




}
