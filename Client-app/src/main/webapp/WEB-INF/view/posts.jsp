
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<title>Home</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<h1>this is posts page</h1>
<p>${message}</p>
<div class="container">
<a href="registration">register</a>
<a href="login">login</a>
<a href="logout">logout</a>
<a href="editPost">editPost</a>
  <sec:authorize access="hasRole('ROLE_USER')">
          <a href="postForm"><button class="btn btn-primary">New Post</button></a>
           </sec:authorize>

<c:forEach var="post" items ="${posts}">

<h2>${post.title}</h2>
<p>Posted By:${post.user.name} &nbsp; Post Date: ${post.created}</p>

<p>${post.content}</p>
<p><a href="posts/${post.id}"><button class="btn btn-xs btn-primary">comments</button></a></p>
</c:forEach>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>