<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="LoginServlet" method="post" onsubmit="return validateForm()">
		<table>
			<tr>
				<td>User name</td>
				<td><input type="text" name="username" id="username"></td>
				<td><span id="usernameError" style="color: red"></span></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id="password"></td>
				<td><span id="passwordError" style="color: red"></span></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>

<script type="text/javascript">

	function validateForm(){
		
		var username = document.getElementById("username").value;
		var password = document.getElementById("password").value;
		
		if(username == "" || username == null){
			document.getElementById("usernameError").innerHTML = "Username can't be blank";
			return false;
		}
		
		if(password == "" || password == null){
			document.getElementById("passwordError").innerHTML = "Password can't be blank";
			return false;
		}
		
		return;
	}

</script>

</body>
</html>