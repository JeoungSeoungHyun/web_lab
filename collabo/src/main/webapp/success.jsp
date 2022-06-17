<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인성공</title>
</head>
<body>

<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String password = request.getParameter("password");
%>
		<div>아이디   <%=id %></div>
		<div>이름       <%=name %></div>
		<div>비밀번호 <%=password %></div>
</body>
</html>