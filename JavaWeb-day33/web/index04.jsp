<%--
  Created by IntelliJ IDEA.
  User: sunday
  Date: 2021/1/27
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name","页面域");
    request.setAttribute("name","请求域");
    session.setAttribute("name","会话域");
    application.setAttribute("name","上下文域");
%>
${pageScope.name}
<hr>
${requestScope.name}
<hr>
${sessionScope.name}
<hr>
${applicationScope.name}
</body>
</html>
