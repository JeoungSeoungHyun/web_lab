<%@page import="java.util.List"%>
<%@page import="site.metacoding.mvc.domain.MyUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>전체 회원정보 페이지입니다</h1>
<hr />
<%
	List<MyUser> users  = (List<MyUser>)request.getAttribute("users");

	for(MyUser user : users){
%>

아이디 : <%=user.getId() %> <br/>
이름 : <%=user.getUsername() %> <br/>
패스워드 : <%=user.getPassword() %> <br/>
이메일 : <%=user.getEmail() %> <br/>
<br/>
<%
	}
%>
</body>
</html>