package com.springbook.view.controller;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Namsoo on 2017. 12. 2..
 */
public class LoginController implements Controller {
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("로그인 처리");

        // 1. 사용자 입력 정보 추출
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        // 2. DB 연동 처리
        UserVO vo = new UserVO();
        vo.setId(id);
        vo.setPassword(password);

        System.out.println("id : "+id+" pw : "+password);

        UserDAO userDAO = new UserDAO();
        UserVO user = userDAO.getUser(vo);

        // 3. 화면 네비게이션
        if (user != null) {
            return "getBoardList.do";
        } else {
            return "login";
        }
    }
}
