<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In</title>
<style type="text/css">
#header {
	background-color: black;
	color: white;
	text-align: center;
	padding: 5px;
}

#footer {
	background-color: black;
	color: white;
	clear: both;
	text-align: center;
	padding: 5px;
	top:400px
}

</style>
<script type="text/javascript">
function submitForm() {
	if(document.getElementById("username").value == "" || document.getElementById("username").value == undefined /*|| document.getElementById("clientId").value.indexOf(' ') != 0*/ ) {
		alert("Please enter correct username!!!");
		return false;
	}
	
	else if(document.getElementById("password").value == "" || document.getElementById("password").value == undefined /*|| document.getElementById("password").value.indexOf(' ') != 0*/ ) {
		alert("Please enter correct password!!!");
		return false;
	}
	else {
		document.getElementById("loginForm").submit();
	}
	
}
</script>
</head>
<body>
	<div id="header">
		<h1>Roommate Finder</h1>
	</div>
	<div align="center" style="height:450px">
	<div id="error" style="display: block; padding-top:150px">
		<font color="red"> <%if(request.getAttribute("errMsg")!=null) { out.println(request.getAttribute("errMsg"));} %>
			<c:if test="${not empty errStr}">
				<c:out value="${errStr }"></c:out>
			</c:if>
		</font>
	</div>
	
	<form id="loginForm" method="post"  action="Login">
		<fieldset style="width:400px">
  	<legend>Log in:</legend>
		<table>
			<tbody>
				<tr>
					<td>Username :</td>
					<td><input type="text" name="username" id="username">
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" id="password"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="button" value="Login" onclick="submitForm()" /> </td>
				</tr>
			</tbody>
		</table>
		</fieldset>
	</form>
	</div>
	<div id="footer">Copyright © rfinder.com</div>
</body>
</html>