<%@ page import="com.springbook.biz.board.BoardVO" %>
<%@ page import="com.springbook.biz.board.impl.BoardDAO" %><%--
  Created by IntelliJ IDEA.
  User: Namsoo
  Date: 2017. 11. 25.
  Time: 오후 3:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=EUC-KR" language="java" %>

<%
    //1. 사용자 입력 정보 추출
    request.setCharacterEncoding("EUC-KR");
    String title = request.getParameter("title");
    String writer = request.getParameter("writer");
    String content = request.getParameter("content");

    //2. DB연동 처리
    BoardVO vo = new BoardVO();
    vo.setTitle(title);
    vo.setWriter(writer);
    vo.setContent(content);

    BoardDAO boardDAO = new BoardDAO();
    boardDAO.insertBoard(vo);

    //3. 화면 네비게이션
    response.sendRedirect("getBoardList.jsp");
%>

