package lk.ijse.fullmodelvslightmodel.config;

import lk.ijse.fullmodelvslightmodel.bean.MyBasicDataSource;
import lk.ijse.fullmodelvslightmodel.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.fullmodelvslightmodel")

public class AppConfig {

    @Bean
    public MyBasicDataSource basicDataSource(){

        /*MyConnection myConnection = new MyConnection();*/

        // inter-bean dependency invocation

        MyConnection myConnection1 = myConnection();
        MyConnection myConnection2 = myConnection();
        MyConnection myConnection3 = myConnection();

        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
        myBasicDataSource.setMyConnection(myConnection1);


        return myBasicDataSource;
    }


    @Bean
    public MyConnection myConnection(){
        return new MyConnection();
    }

}
