<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- <%
String userId = (String) session.getAttribute("user_id");
if(userId == null) {
    // 로그인 안 했으면 로그인 페이지로 리다이렉트
    response.sendRedirect("/Omok/login.jsp");
    return;
}
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>메인페이지 임시입니다.</h1>
	로그인 및 세션 아이디 : <%=session.getAttribute("user_id") %>
</body>
</html>