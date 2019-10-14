<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: BlessedLove
  Date: 10/13/2019
  Time: 10:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-color: green">
<%
    int first=(Integer.parseInt(request.getParameter("num1"))) ;
    int second=(Integer.parseInt(request.getParameter("num2"))) ;

    int answer=first+second;

    PrintWriter o=response.getWriter();
    o.print(answer);


%>
</body>
</html>
