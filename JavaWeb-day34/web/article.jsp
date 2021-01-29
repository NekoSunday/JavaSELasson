<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<!DOCTYPE HTML>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
			<title>用户列表</title>
			<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
			<script src="js/jquery-1.9.1.min.js"></script>
			<script src="assets/js/bootstrap.min.js"></script>
			<style>
				h3,
				h4 {
					margin: 0px;
					padding: 0px;
				}

				p {
					margin-top: 10px;
				}
			</style>
		</head>

	<body>
		<div class="container">
			<h2 style="text-align: center;">欢迎您：${loginUser.name}</h2>
			<h1 style="text-align: center;"><a href="add.jsp" class="btn btn-success">发布文章</a></h1>
			<c:forEach items="${articleList}" var="article">
			<hr>
			<div style="padding:20px;background-color: #eee;border-radius: 10px;">
				<h3 style="text-align: center;">${article.title}</h3>
				<p>${article.content}</p>
				<h4 style="text-align: right;">发布人：${article.publishUser}</h4>
				<h4 style="text-align: left;">发布日期：${article.publishDate}</h4>
			</div>
			<hr>
			</c:forEach>
		</div>

	</body>
</html>
