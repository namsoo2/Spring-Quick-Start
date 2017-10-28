package polymorphism;

/**
 * Created by Namsoo on 2017. 10. 28..
 */
public class BeanFactory {

    /*
    * Factory 패턴
    * */

    public Object getBean(String beanName) {
        if (beanName.equals("samsung")) {
            return new SamsungTV();
        } else if (beanName.equals("lg")) {
            return new LgTV();
        }
        return null;
    }
}
