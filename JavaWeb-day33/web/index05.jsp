<%@ page import="com.sunday.demo01.User" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: sunday
  Date: 2021/1/27
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User(1, "张三");

    pageContext.setAttribute("user",user);
%>

<hr>
<h2>获得JavaBean的属性值</h2>
ID:${user.id},用户名：${user.name}
<%
    List<String> addr = Arrays.asList("金华", "莆田", "怀化");
    request.setAttribute("addr",addr);
%>
<h2>取出List元素</h2>
${addr[0]}---${addr[1]}---${addr[2]}

<hr>

<%
    int[] nums={100,200,300,400};
    request.setAttribute("nums",nums);
%>
<h2>取出数组的元素</h2>
${nums[0]}---${nums[1]}---${nums[2]}---${nums[3]}
<%
    HashMap<String, String> map = new HashMap<>();
    map.put("No1","辽宁");
    map.put("No2","上海");
    map.put("No3","北京");
    request.setAttribute("map",map);
%>
<h2>取出map元素</h2>
${map.No1}---${map["No2"]}---${map.get("No3")}


</body>
</html>
