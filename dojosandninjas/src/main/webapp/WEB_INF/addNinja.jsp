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
		<h1>Add Ninja</h1>
	<form:form action="/ninjas/add" method="post" modelAttribute="newNinja">
		<h3>
		<form:label path="dojo">Dojo</form:label>
		<form:select cssClass="box" path="dojo">
   		   <c:forEach items="${dojos}" var="dojo">
   			   <form:option value="${dojo}"><c:out value="${dojo.name}"/></form:option>
		   </c:forEach>
 		</form:select>
		</h3>
		<h3>
		<form:label path="firstName">First Name: </form:label>
		<form:input path="firstName"/>
		<form:errors path="firstName"></form:errors>
		</h3>
		<h3>
		<form:label path="lastName">Last Name: </form:label>
		<form:input path="lastName"/>
		<form:errors path="lastName"></form:errors>
		</h3>
		<h3>
		<form:label path="age">Age: </form:label>
		<form:input type = "number" path="age"/>
		<form:errors path="age"></form:errors>
		</h3>
		<button class="btn btn-outline-success">Add Ninja</button>
	</form:form>
	<a href="/dojos">Dashboard</a>
	</div>
</body>
</html>