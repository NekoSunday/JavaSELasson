<%@ page import="java.util.Arrays" %>
<%@ page import="com.sunday.demo01.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: sunday
  Date: 2021/1/27
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <style>
        table {
            width: 500px;
            border-collapse: collapse;
        }

        tr {
            height: 35px;
        }

        td {
            text-align: center;
        }
    </style>
</head>
<body>
    <%
        List<Student> students = Arrays.asList(
                new Student(1, "张三", 1, 90),
                new Student(2, "李四", 0, 95),
                new Student(3, "王五", 1, 87),
                new Student(4, "丽丽", 0, 79)
        );
        request.setAttribute("stuList",students);
    %>

<table border="1">
    <tr>
        <th>状态</th>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>成绩</th>
    </tr>

    <c:forEach items="${stuList}" var="stu" varStatus="row">
        <tr ${row.index%2==0?"style='background-color:red'":"style='background-color:green'"}>
            <th>${row.index}</th>
            <th>${stu.id}</th>
            <th>${stu.name}</th>
            <th>${stu.gender==0?'女':'男'}</th>
            <th>${stu.score}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
