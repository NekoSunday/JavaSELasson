<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户列表</title>
    <style type="text/css">
        td, th {
            text-align: center;
        }

    </style>

</head>

<body>
<div>
    <h2 style="color:red;text-align: center">欢迎您：${loginUser.username}</h2>
    <h3 style="text-align: center">通讯录：</h3>
    <table border="1" align="center" width="500" height="200">
        <tr style="background-color:#c4c7ce;">
            <th>ID</th>
            <th>用户名</th>
            <th>密码</th>
            <th>性别</th>
            <th>年龄</th>
            <th>地址</th>
        </tr>

        <%--使用forEach遍历元素--%>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.gender==0?'男':'女'}</td>
                <td>${user.age}</td>
                <td>${user.address}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
