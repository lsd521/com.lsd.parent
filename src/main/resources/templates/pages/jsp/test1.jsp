<%@ page language="java"  import="java.util.*"  contentType="text/html;charset=UTF-8"  %>
<%--%
    /**这是变量*/
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    //System.out.println("path--"+path);
    //System.out.println("basePath--"+basePath);
%>--%>
<html>
<head>
    <title>Display Current Date & Time</title>
</head>
<body>
<center>
    <h1>Display Current Date & Time</h1>
</center>
<%    Date date = new Date();    out.print( "<h2 align=\"center\">" +date.toString()+"</h2>");
%>
</body>
</html>