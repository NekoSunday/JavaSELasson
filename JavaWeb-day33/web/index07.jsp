<%--
  Created by IntelliJ IDEA.
  User: sunday
  Date: 2021/1/27
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="index07.jsp">
    请输入分数：
    <input type="text" name="score" value="${param.score}">
    <input type="submit" value="评级">
</form>

<c:if test="${not empty param.score}">
<c:choose>
    <c:when test="${param.score>=80&&param.score<=100}">优秀</c:when>
    <c:when test="${param.score<80&&param.score>=60}">良好</c:when>
    <c:when test="${param.score<60&&param.score>=0}">不及格</c:when>
    <c:otherwise>分数有误</c:otherwise>
</c:choose>
</c:if>
</body>
</html>
