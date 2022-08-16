<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Functions -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Travels</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div>
		<h1 style="text-transform: capitalize;"><c:out value="${dojo.name}"/> Ninjas</h1>
		<table class = "table">
			<thead>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</thead>
			<tbody>
				<c:forEach items="${dojo.ninjas}" var="ninja">
				<tr scope = "row">
				    <td><c:out value="${ninja.firstName}"/></td>
				    <td><c:out value="${ninja.lastName}"/></td>
				    <td><c:out value="${ninja.age}"/></td>
				 </tr>
				 </c:forEach>
			</tbody>
		</table>
		<a href="/ninjas/new"><button class="btn btn-outline-success">Add Ninja</button></a>
		<a href="/dojos">Dashboard</a>
	</div>
</body>
</html>