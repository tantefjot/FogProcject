<%-- 
    Document   : signup
    Created on : 24-11-2017, 11:14:53
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
        <h1>signup</h1>
        <form action="signupServlet" method="get">
            <input type="username" value="username" name="username"><br>
        <input type="pasword" value="password" name="password"><br>
        <input type="email" value="email" name="email"><br>
        <input type="firstname" value="firstname" name="firstname"><br>
        <input type="lastname" value="lasttname" name="lastname"><br>
        <input type="phone" value="phone" name="phone"><br>
        <input type="city" value="city" name="city"><br>
        <input type="zipcode" value="zipcode" name="zipcode"><br>
        <input type="address" value="address" name="address"><br>
        <input type="submit" value="Submit">
        </form>
    </body>
</html>
