<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/demomvc/save" method="post">
		姓名：<input type="text" name="pname"><br/>
		日期：<input type="date" name="pdate"><br/>
		时间：<input type="text" name="ptime"><br/>
		<input type="submit" value="submit">
	</form>
</body>
</html>