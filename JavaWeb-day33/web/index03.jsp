<%--
  Created by IntelliJ IDEA.
  User: sunday
  Date: 2021/1/27
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name="张三";
%>
<%!
   String name="李四";
%>
<h1><%=name%></h1>
<h1><%=this.name%></h1>
</body>
</html>
