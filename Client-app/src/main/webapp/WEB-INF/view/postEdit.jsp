<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Edit Post</title>
</head>
<body>
	<h1>Edit the post</h1>
    <c:forEach var="post" items ="${user.posts}">
    <p>${post.content}</p>
    </c:forEach>

</body>
</html>