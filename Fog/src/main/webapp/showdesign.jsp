<%-- 
    Document   : showdesign
    Created on : 24-11-2017, 09:36:08
    Author     : Jonas
--%>

<%@page import="data.DesignMapper"%>
<%@page import="logic.Design"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
      
        user design by designid <%out.print(session.getAttribute("designid"));%>
     <h3>your height</h3><%out.print(session.getAttribute("height"));%>
        <h3>your length</h3> <%out.print(session.getAttribute("length"));%>
        <h3>your width</h3>  <%out.print(session.getAttribute("width"));%>
        <h3>your designame</h3> <%out.print(session.getAttribute("desingname"));%>
        <h3> your id</h3> <%out.print(session.getAttribute("userid"));%>
        
    </body>
</html>
