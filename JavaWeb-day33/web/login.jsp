<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
</head>
<body>

<form action="login" method="post">
    用户名：<input type="text" name="username">
    <hr>
    密码：<input type="password" name="password">
    <hr>
    验证码：<input type="text" name="checkCode"> <a href="javascript:location.reload()"><img src="generateCode" alt=""></a>
    <hr>
    <input type="submit" value="登录">

    <hr>
    <h3>${error}</h3>
</form>
</body>
</html>