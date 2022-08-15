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
<h1>Edit <c:out value = "${travel.title }"/></h1>
	<form:form action="/travels/${travel.id }/update" method="put" modelAttribute="travel" class = "form">
		<p>
		<form:label path="title">Expense:</form:label>
		<form:input path="title"/>
		<form:errors path="title"></form:errors>
		</p>
		<p>
		<form:label path="vendor">Vendor:</form:label>
		<form:input path="vendor"/>
		<form:errors path="vendor"></form:errors>
		</p>
		<p>
		<form:label path="amount">Cost:</form:label>
		<form:input type="number" path="amount"/>
		<form:errors path="amount"></form:errors>
		</p>
		<p>
		<form:label path="description">Description:</form:label>
		<form:input path="description"/>
		<form:errors path="description"></form:errors>
		</p>
		<button class="btn btn-outline-success">Edit this expense!</button>
	</form:form>
	<a href="/travels">Cancel</a>
</body>
</html>