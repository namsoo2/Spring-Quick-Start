package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by Namsoo on 2017. 10. 28..
 */
public class TVUser {


//    public static void main(String[] args) {
//
//        /*
//        You should keep your Spring files in another folder, marked as "source" (just like "src" or "resources").
//        WEB-INF is not a source folder, therefore it will not be included in the classpath (i.e. JUnit will not look for anything there).
//         처음에 applicationContext.xml이 WEB-INF에 있었는데, 소스 폴더가 아니라서 파일을 못 찾음
//         TODO 소스폴더 설정하는 방법이 있었던거 같은데 한 번 찾아보기
//         */
//
//        //1. Spring 컨테이너를 구동한다
//        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
//
//        //2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다
//        TV tv = (TV) factory.getBean("tv");
//        tv.powerOn();
//        tv.powerOff();
//        tv.volumeUp();
//        tv.volumeDown();
//
//
//        CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
//        List<String> addressList = bean.getAddressList();
//        for (String address : addressList) {
//            System.out.println("주소는 : " + address);
//        }
//
//
//        //3. Spring 컨테이너를 종료한다
//        factory.close();
//
//
//    }
}
