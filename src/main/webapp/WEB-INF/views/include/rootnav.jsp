<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
</script>
<style>
#nav {
	background-color : lightgray;
	border : 1px solid lightgray;
}
</style>
</head>
<body>
<div id="nav" class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="/www">모이다</a>
			<a class="navbar-brand" href="/www/home">메인페이지</a>
			<a class="navbar-brand" href="/www/admin/main">관리자페이지</a>
		</div>
	</div>
</div>
</body>
</html>