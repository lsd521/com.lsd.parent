<%@ page language="java" contentType="text/html;charset=UTF-8"  %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%!
    public String getLocalIP(HttpServletRequest request) {
        String  adrr = request.getLocalAddr();
        System.out.println("-----");
        return adrr;
    }
%>
<%
    String encryptKey = "CHDC" + new SimpleDateFormat("MMddyyyy").format(new Date());
%>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<p>sdsds</p>
<div>
    <input type="hidden" name="userIp" value="<%=getLocalIP(request) %>"/></br>
    <p><%=encryptKey%></p>
</div>
</body>
</html>