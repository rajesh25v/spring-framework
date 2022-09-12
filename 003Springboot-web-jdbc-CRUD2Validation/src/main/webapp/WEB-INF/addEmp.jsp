<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.errors{
color: red;
}
</style>
</head>
<body>

	<h1>wellcome to employee all</h1>
	<hr>
	<form:form = action="./savEmp" method="post" modelAttribute="employee">
		<table>
			<tr>
				<td>eName</td>
				<td><form:input type="text" name="name" path="name"></form:input>
					<form:errors path="name" class="errors"></form:errors></td>

			</tr>
			<tr>
				<td>ESal</td>
				<td><form:input type="text" name="esal" path="sal"></form:input>
					<form:errors path="esal" class="errors"></form:errors></td>

			</tr>

			<tr>
				<td><input type="text" name="submit"></td>
				<td><input type="text" name="resert"></td>
			</tr>
		</table>

	</form:form>
</body>
</html>