<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Registration page </title>
</head>
<body>
<form action="http to be seen again ">  
<input type="text" name="name" value="Name..." onclick="this.value=''"/><br/>  
<input type="text" name="usename"  value="User name" onclick="this.value=''"/><br/>  
<input type="password" name="upass"  value="Password..." onclick="this.value=''"/><br/>  
<input type="password" name="upass2"  value="Password..." onclick="this.value=''"/><br/> 
<input type="submit" value="register"/>

 
<%
String password1 = request.getParameter("upass");
String password2 = request.getParameter("upass2");
//Is the page submitted?
if (password1!=null && password2!=null) {
    
   // Are the passwords equal?
   if (!password1.equals(password2)) {
%>
     <%@ include file="ErrorPasswordNotTheSamel" %>
<%
   }
   else  %>
   <%@ include file="posts" %>
   <%
   
}
%>
</form>
</body>
</html>