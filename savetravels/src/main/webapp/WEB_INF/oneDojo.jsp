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
		<a href="/travels">Home</a>
		<h1 style="text-transform: capitalize;">${travel.title}</h1>
		<p style="text-transform: capitalize;"> <strong>Vendor:</strong> ${travel.vendor }</p>
		<p><strong>Description:</strong> ${travel.description }</p>
		<p><strong>Amount: </strong><span>$</span>${travel.amount }</p>
		<a href="/travels">Dashboard</a>
		<a href = "/travels/${travel.id}/edit">Update</a>
		<form action="/travels/${travel.id}/delete" method="post">
		    <input type="hidden" name="_method" value="delete">
		    <input type="submit" value="Delete" class = "btn btn-danger">
		</form>
	</div>
</body>
</html>