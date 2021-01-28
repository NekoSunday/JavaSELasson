<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: sunday
  Date: 2021/1/27
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> addr = Arrays.asList("江西", "陕西", "山西", "广西");
%>

<ol>
    <%
        for (String s : addr) {

    %>
    <li>
        <%=s%>
    </li>
    <%}%>
</ol>
</body>
</html>
