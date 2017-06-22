<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Registration page </title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false"
        aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
      <a class="navbar-brand" href="/">Book Club</a>
    </div>
    <div id="navbar" class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
      <li><a  class="active" href="${contextPath}/posts"><span class="glyphicon glyphicon-home"></span>Home</a></li>
        <li><a href="${contextPath}/postForm">New Post</a></li>
        <li><a href="${contextPath}/editPost">My Posts</a></li>
        <li><a href="${contextPath}/aboutUs">About Us</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
       
        <li><a href="${contextPath}/login" >Login</a></li>
        <li><a href="${contextPath}/logout" >Logout</a></li>
      </ul>
    </div>
    <!--/.nav-collapse -->
  </div>
</nav>
<form action="registration" method="post">  
<div class="row">
<div class="col-sm-6">
 <div class="form-group">
    <label for="name"> Name</label>
    <input type="text" class="form-control" id="name" name ="name" placeholder="name" >
      </div>
   <div class="form-group">
    <label for="username" class="col-2 col-form-label"> User name</label>
    <div class="col-2">
    <input type="text" class="form-control" id="username" name ="username" placeholder="User name" >
      </div>  
      </div>
      <div class="form-group">
    <label for="password"> Password</label>
    <input type="password" class="form-control" id="username" name ="password"  >
      </div>  
<!-- <input type="text" name="name" value="Name..." onclick="this.value=''"/><br/>   -->
<!-- <input type="text" name="username"  value="User name" onclick="this.value=''"/><br/>   -->
<!-- <input type="password" name="password"  /><br/>   -->
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

   <button type="submit" class="btn btn-primary">Register</button>
      </div>
      </div>
 
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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>