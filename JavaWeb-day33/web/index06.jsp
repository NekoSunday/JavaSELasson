<%--
  Created by IntelliJ IDEA.
  User: sunday
  Date: 2021/1/27
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${param.age>=18}">成年了</c:if>
<c:if test="${param.age<18}">未成年</c:if>
</body>
</html>
