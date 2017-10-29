package com.springbook.biz.user;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by Namsoo on 2017. 10. 29..
 */
public class UserServiceClient {

    public static void main(String[] args) {

        //1. Spring 컨테이너를 구동한다
        AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");

        //2.
        UserService userService = (UserService) container.getBean("userService");

        //3. 글 등록 기능 테스트
        UserVO vo = new UserVO();
        vo.setId("test");
        vo.setPassword("test1");

        UserVO user = userService.getUser(vo);
        if (user != null) {
            System.out.println(user.getName() + "님 환영!");
        } else {
            System.out.println("로그인 실패");
        }


        //5. spring 컨테이너 종료
        container.close();
    }

}
