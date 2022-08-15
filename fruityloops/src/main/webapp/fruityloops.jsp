<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Fruity Loops</title>
</head>
<body>
<h1>Fruit Store</h1>
<table>
<tr>
	<th>Fruit</th>
	<th>Price</th>
</tr>
<c:forEach var="fruit" items="${fruits}">
<tr>
    
    	<td><c:out value="${fruit.getName()}"></c:out></td>
    	<td><c:out value="${fruit.getPrice()}"></c:out></td>
    
</tr>
</c:forEach>
</table>
</body>
</html>