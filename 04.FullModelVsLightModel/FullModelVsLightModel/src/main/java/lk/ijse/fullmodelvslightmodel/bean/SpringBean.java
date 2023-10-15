package lk.ijse.fullmodelvslightmodel.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component

public class SpringBean {
    public SpringBean() {
        System.out.println("Spring Bean Instantiated");
    }

    @Bean
    public MyBasicDataSource basicDataSource(){


        // inter-bean dependency invocation

       /* MyConnection myConnection1 = myConnection();
        MyConnection myConnection2 = myConnection();
        MyConnection myConnection3 = myConnection();*/

        MyConnection myConnection1 = myConnection(); // not satisfy inter bean dependency
        MyConnection myConnection2 = myConnection();
        MyConnection myConnection3 = myConnection();

        System.out.println(myConnection1);
        System.out.println(myConnection2);
        System.out.println(myConnection3);



        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
        myBasicDataSource.setMyConnection(myConnection1);

        return myBasicDataSource;

    }


    @Bean
    public MyConnection myConnection(){
        return new MyConnection();
    }

}
