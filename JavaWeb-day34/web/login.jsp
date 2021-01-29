<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>用户登录</title>
		<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
		<script src="js/jquery-1.9.1.min.js"></script>
		<script src="assets/js/bootstrap.min.js"></script>
	</head>

	<body>

		<div class="container">
			<form  action="login" method="post">

				<h5 class="page-header alert-info" style=" padding:10px; text-align: center;">
					用户登录
				</h5>

				<div class="form-group">
					<label for="username">用户名：</label>
					<input type="text" id="username" class="form-control" name="username" placeholder="请输入用户名" />
				</div>

				<div class="form-group">
					<label for="password">密码：</label>
					<input type="password" id="password" class="form-control" name="password" placeholder="请输入密码" />
				</div>

				<hr>
				<div class="form-group">
					<input type="submit" class="btn btn-primary" value="登录">
					<input type="reset" class="btn  btn-danger" value="重置">
				</div>

				<hr>
				<h3 style="color: red">${error}</h3>
			</form>
		</div>

	</body>
</html>
