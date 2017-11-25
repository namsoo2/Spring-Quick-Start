<%--
  Created by IntelliJ IDEA.
  User: Namsoo
  Date: 2017. 10. 28.
  Time: 오후 2:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=EUC-KR" language="java" %>
<html>
<head>
    <meata http-equiv="Content-Type" content="text/html; charset=EUC-KR"
    <title>로그인</title>
</head>


<body>
<center>
    <h1>로그인</h1>
    <hr>
    <form action="login_proc.jsp" method="post">
        <table border="1" cellpadding="0" cellspacing="0">
            <tr>
                <td bgcolor="orange">아이디</td>
                <td><input type="text" name="id" aria-valuetext="test"></td>
            </tr>
            <tr>
                <td bgcolor="orange">비밀번호</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="로그인">
                </td>
            </tr>
        </table>
    </form>
    <hr>
</center>
</body>
</html>
