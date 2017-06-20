<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<title>Comment Page</title>
</head>
<body>
<h1>Single Post</h1>
<p>${post.title}</p>
<p>${post.content}</p>

<c:forEach var="comment" items ="${comments}">
<tr>
<td>${comment.content}</td>
</tr>
</c:forEach>
</body>
</html>