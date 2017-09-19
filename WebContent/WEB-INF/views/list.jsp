<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Test</title>
</head>
<body>
<h1>DEMO INFORMATION</h1>
	<c:forEach items="${demosFromServer}" var="demo">
	${demo.pid }<br>
	${demo.pname }<br>
	${demo.pdate }<br>
	${demo.ptime }<br>
	${demo.price }<br>
	${demo.pnum }<br>
	${demo.refid }<br>
	<h3>***************************************</h3>
	</c:forEach>
</body>
</html>