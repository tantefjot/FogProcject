<%-- 
    Document   : userprofile
    Created on : 24-11-2017, 11:13:21
    Author     : Jonas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h3> you are logged as</h3>  <%out.print(session.getAttribute("user"));%>
    </body>
</html>
