<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.errorBack{
		background-color: red;
		color: #000;
		border: 3px solid #ff0000;
		padding: 8px;
		margin: 16px;
	}
</style>
</head>
<body>
	<h1>Registration : ${wel}</h1>
	<hr />
	<form:form action="" modelAttribute="registration">
		<form:errors path="*" element="div" cssClass="errorBack"/>
		<table>
			<tr>
				<td>
					<spring:message code="name" /> 
				</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name"  cssClass="errorBack"/></td>
			</tr>
			
			<tr >
				<td colspan="3">
					<input type="submit" value="Add Registraion" /> 
				</td>
			</tr>
		</table>
		
		
	</form:form >
</body>
</html>