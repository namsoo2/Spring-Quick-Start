<%--
  Created by IntelliJ IDEA.
  User: Namsoo
  Date: 2017. 11. 9.
  Time: 오후 2:35
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.springbook.biz.user.impl.UserDAO" %>
<%@ page import="com.springbook.biz.user.UserVO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
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
        response.sendRedirect("getBoardList.jsp");
    } else {
        response.sendRedirect("login.jsp");
    }
%>