<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>modify</title>
</head>
<body>
	<a href="/ch05/user/list">직원목록</a>
	
	<h4>직원수정</h4>
	<form action="/ch05/user/modify" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" readonly value="${user.uid}" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${user.name}" /></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="tel" name="hp" value="${user.hp}"/></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age" value="${user.age}"/></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="직원수정"/>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>





















































