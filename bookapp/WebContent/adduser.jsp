<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New user registration</title>
</head>
<body>
<form action="UserMgtController.do" method="post">
	<table>
		<tr>
			<td>username</td>
			<td><input type="text" name="username" id="unId"/></td>
		</tr>
		<tr>
			<td>password</td>
			<td><input type="text" name="password" id="pwId"/></td>
		</tr>
		<tr>
			<td>profile</td>
			<td>
			<select name="profile" size="1"> 
				<option value="mgr">mgr</option> 
				<option value="emp">emp</option> 
			</select>
		</td>
		</tr>
		
		<tr>
			<td> <input type="submit"/> </td>
		</tr>
	</table>
</form>
</body>
</html>