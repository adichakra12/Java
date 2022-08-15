<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style=" position: absolute; left: 800px;">
<h1>Here's Your Omikuji!</h1>
<div style="background-color: lightblue; border: 2px solid black; width: 280px; height: 800px; padding: 10px;">
<p style="font-size: 20px;">In <c:out value="${years}"/> years you will live in <c:out value="${city}"/> with <c:out value="${person}"/> as your roommate, 
<c:out value="${profession}"/> for a living. The next time you see a <c:out value="${thing}"/>, you will have good luck. 
<c:out value="${letter}"/>.</p>
</div>
</div>

</body>
</html>