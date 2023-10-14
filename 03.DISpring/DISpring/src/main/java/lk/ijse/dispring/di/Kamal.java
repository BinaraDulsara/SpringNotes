package lk.ijse.dispring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kamal {

//    @Autowired
    GoodKamali kamali ;

    @Autowired
    public Kamal(GoodKamali k) {
            this.kamali=k;
//            System.out.println("Kamal  into the context !! ");

    }

    public void ChattingWithKamali(){

        kamali.chat();

    }
}
