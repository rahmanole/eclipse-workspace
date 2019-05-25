<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="">
		<form:form action="formSubmit" method="POST" modelAttribute="user">
			<table>
				<tr>
					<td>Name</td>
					<td><form:input path="name"/></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><form:input path="email"/></td>
				</tr>
				<tr>
					<td></td>
					<td><form:input path="country"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit"></td>
				</tr>
			</table>
			
		</form:form>
	</div>
</body>
</html>