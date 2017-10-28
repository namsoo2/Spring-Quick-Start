package polymorphism;

/**
 * Created by Namsoo on 2017. 10. 28..
 */
public class LgTV implements TV {
    public LgTV(){
        System.out.println("Lg TV - 객체 생성");
    }
    public void powerOn() {
        System.out.println("Lg TV - 전원 켠다");
    }

    public void powerOff() {
        System.out.println("Lg TV - 전원 끈다");
    }

    public void volumeUp() {
        System.out.println("Lg TV - 소리를 올린다");
    }

    public void volumeDown() {
        System.out.println("Lg TV - 소리를 내린다");
    }
}
