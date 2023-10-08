package lk.ijse.dispring.di;

import org.springframework.stereotype.Component;


@Component
public class Kamali implements GoodKamali {
    public Kamali() {
//        System.out.println("Kamali into the index !! ");
    }

    @Override
    public void chat(){
        System.out.println("Chatting");
    }
}
