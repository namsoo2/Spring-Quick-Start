package com.springbook.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Namsoo on 2017. 12. 2..
 */
@Controller
public class LogoutController {

    @RequestMapping("/logout.do")
    public String logout(HttpSession session) {
        System.out.println("로그아웃 처리");

        //1. 브라우저와 연결된 세션 객체를 강제 종료한다
        session.invalidate();

        //2. 세션 종료 후, 메인 화면으로 이동한다
        return "redirect:login.jsp";
    }
}
