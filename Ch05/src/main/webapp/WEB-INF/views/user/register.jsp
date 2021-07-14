<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RegisterService</title>
</head>
<body>
	<h1>Register</h1>

	<a href="/ch05/user/list">직원목록</a>
	<h3>직원등록</h3>
	<form action="/ch05/user/register" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="tel" name="hp" /></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="직원등록"></td>
			</tr>
		</table>
	</form>
</body>
</html>




























