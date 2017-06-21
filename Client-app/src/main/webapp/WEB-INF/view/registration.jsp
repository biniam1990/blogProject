<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Welcome to Registration page </title>
</head>
<body>
<form action="registration" method="post">  
<input type="text" name="name" value="Name..." onclick="this.value=''"/><br/>  
<input type="text" name="username"  value="User name" onclick="this.value=''"/><br/>  
<input type="password" name="password"  value="Password..." onclick="this.value=''"/><br/>  
<input type="password" name="upass2"  value="Password..." onclick="this.value=''"/><br/> 
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
<input type="submit" value="register"/>

 
 <%-- <%
String password1 = request.getParameter("upass");
String password2 = request.getParameter("upass2");
//Is the page submitted?
if (password1!=null && password2!=null) {
    
   // Are the passwords equal?
   if (!password1.equals(password2)) {
%>
     <%@ include file="ErrorPasswordNotTheSame" %>
<%
   }
   else  %>
   <%@ include file="posts" %>
   <%
   
}
%> --%>
</form>
</body>
</html>