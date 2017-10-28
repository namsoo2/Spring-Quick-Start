package polymorphism;

/**
 * Created by Namsoo on 2017. 10. 28..
 */
public class AppleSpeaker implements Speaker {
    public AppleSpeaker() {
        System.out.println("애플 스피커 객체 생성");
    }

    public void volumeUp() {
        System.out.println("애플 스피커 소리 올린다");
    }

    public void volumeDown() {
        System.out.println("애플 스피커 소리 내린다");
    }
}
