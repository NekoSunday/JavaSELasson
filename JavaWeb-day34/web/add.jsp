<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<!DOCTYPE HTML>
		<html>
			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
				<title>用户列表</title>
				<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
				<script src="js/jquery-1.9.1.min.js"></script>
				<script src="assets/js/bootstrap.min.js"></script>
			</head>

	<body>
		<div class="container">
			<h2 style="text-align: center;">添加文章</h2>
			
			<hr>
			<form action="add">
				<div  class="form-group">
					<label for="title">文章标题</label>
					<input class="form-control" type="text"  id="title" name="title">
				</div>
				<div  class="form-group">
					<label for="content">文章正文：</label>
					<textarea class="form-control" id="content" name="content" rows="8"></textarea>
				</div>
				
				<h1 style="text-align: center;">
					<input type="submit" value="添加文章" class="btn btn-success">
				</h1>
			</form>


		</div>

	</body>
</html>
