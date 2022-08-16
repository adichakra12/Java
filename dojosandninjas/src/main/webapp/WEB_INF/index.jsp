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
<title>Dojos and Ninjas</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   <h1>Dojos</h1>
	<table class="table">
	<thead>
	<tr scope="row">
		<th>Name</th>
		<th>Created On</th>
		<th>Updated At</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="dojo" items="${dojos }">
	<tr scope = "row">
		<td><a href='/dojos/<c:out value="${dojo.id }"/>'><c:out value="${dojo.name }"/></a></td>
		<td><fmt:formatDate type="date" value="${dojo.createdAt }"/></td>
		<td>
			<c:choose>
				<c:when test="${dojo.updatedAt != null }">
					<fmt:formatDate value="${dojo.updatedAt }"/>	
				</c:when>
				<c:otherwise>
				This dojo has not been updated
				</c:otherwise>
			</c:choose>
		</td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
	<a href="/dojos/new"><button class="btn btn-outline-success">Add Dojo</button></a>
	<a href="/ninjas/new"><button class="btn btn-outline-success">Add Ninja</button></a>
</body>
</html>

