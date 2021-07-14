<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>register</title>
</head>
<body>
	<h1>RegisterService</h1>
	
	<a href="../member/list.do">직원목록</a>
	<h3>직원등록</h3>
	<form action="./proc/insertProc.jsp" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="uid"/>
				</td>
			</tr>			
			<tr>
				<td>이름</td>
				<td>
					<input type="text" name="name"/>
				</td>
			</tr>			
			<tr>
				<td>휴대폰</td>
				<td>
					<input type="tel" name="hp"/>
				</td>
			</tr>			
			<tr>
				<td>직급</td>
				<td>
					<select name="pos">
						<option>사원</option>
						<option>대리</option>
						<option>과장</option>
						<option>차장</option>
						<option>부장</option>
					</select>
				</td>
			</tr>			
			<tr>
				<td>부서</td>
				<td>
					<select name="dep">
						<option value="101">영업1부</option>
						<option value="102">영업2부</option>
						<option value="103">영업3부</option>
						<option value="104">영업지원부</option>
						<option value="105">인사부</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="직원등록">
				</td>
			</tr>			
		</table>
	</form>
</body>
</html>




























