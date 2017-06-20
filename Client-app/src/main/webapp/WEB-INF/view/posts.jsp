
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>this is posts page</h1>

<c:forEach var="post" items ="${posts}">
<tr>
<td>${post.title}</td>
</tr>
<tr><td>${post.content}</td></tr>
</c:forEach>
</body>
</html>