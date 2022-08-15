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
   <h1>Save Travels</h1>
	<table class="table">
	<thead>
	<tr scope="row">
		<th>Expense</th>
		<th>Vendor</th>
		<th>Amount</th>
		<th>Created On</th>
		<th>Updated At</th>
		<th>Actions</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="travel" items="${travels }">
	<tr scope = "row">
		<td><a href='/travels/<c:out value="${travel.id }"/>'><c:out value="${travel.title }"/></a></td>
		<td><c:out value="${travel.vendor }"/></td>
		<td>$<c:out value="${travel.amount }"/>0</td>
		<td><fmt:formatDate type="date" value="${travel.createdAt }"/></td>
		<td>
			<c:choose>
				<c:when test="${travel.updatedAt != null }">
					<fmt:formatDate value="${travel.updatedAt }"/>	
				</c:when>
				<c:otherwise>
				This expense has not been updated
				</c:otherwise>
			</c:choose>
		</td>
		<td>
		<a href = "/travels/${travel.id}/edit">Update</a>
		<form action="/travels/${travel.id}/delete" method="post">
		    <input type="hidden" name="_method" value="delete">
		    <input type="submit" value="Delete" class = "btn btn-danger">
		</form>
		</td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
	<a href="/travels/new"><button class="btn btn-outline-success">Add Expense</button></a>
</body>
</html>

