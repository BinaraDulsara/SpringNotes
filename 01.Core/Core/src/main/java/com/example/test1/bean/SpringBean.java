package com.example.test1.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean is working ");
    }
    /*public void testBean(){
        System.out.println("SpringBean is working !!");
    }
*/
}
