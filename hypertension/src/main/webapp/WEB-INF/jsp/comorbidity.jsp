<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Registration</title>
<style>
body {
	font-size: 20px;
	color: teal;
	font-family: Calibri;
}

td {
	font-size: 15px;
	color: black;
	width: 100px;
	height: 22px;
	text-align: left;
}

.heading {
	font-size: 18px;
	color: white;
	font: bold;
	background-color: orange;
	border: thick;
}
</style>
</head>
<body>
	<br />
	<b>Clinical Decision Support <br /> please provide patient's demographic and clinical info </b>
	<br />
	<br />
	<div>
		<form:form method="post" action="insert" modelAttribute="comorbidity">
			<table>

				<tr>
					<td>Age :</td>
					<td><form:input path="age" /></td>
				</tr>
<tr>
					<td>Gender :</td>
					<td><form:radiobuttons path="gender" items="${map.sexList}" /></td>
				</tr>
				<tr>
					<td>Race :</td>
					<td><form:select path="race" items="${map.raceList}" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" value="Save" /></td>
				</tr>
				
			</table>
		</form:form>
	</div>
</body>
</html>