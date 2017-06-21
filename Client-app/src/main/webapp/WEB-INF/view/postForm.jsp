<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Post Form</title>
</head>
<body>
	<h1>post form</h1>

	 <form action="1/posts" method="post">
		Title<input type="text" name="title"/></br>
		 Content<input type="text"  name="content" /> 
		 <input type="submit" value="Post">
	</form> 
</body>
</html>