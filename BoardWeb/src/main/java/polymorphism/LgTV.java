package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Namsoo on 2017. 10. 28..
 */

@Component("lgTV")
public class LgTV implements TV {

    @Autowired
    private Speaker speaker;

    public LgTV() {
        System.out.println("Lg TV - 객체 생성");
    }

    public void powerOn() {
        System.out.println("Lg TV - 전원 켠다");
    }

    public void powerOff() {
        System.out.println("Lg TV - 전원 끈다");
    }

    public void volumeUp() {
        speaker.volumeUp();
    }

    public void volumeDown() {
        speaker.volumeDown();
    }
}
