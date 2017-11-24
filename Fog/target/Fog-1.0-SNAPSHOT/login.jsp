<%-- 
    Document   : login
    Created on : 24-11-2017, 11:13:48
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
        <h1>login</h1>
        <form action="loginServlet" method="get">
            <input type="username" value="username" name="username">
            <input type="password" value="password" name="password">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
