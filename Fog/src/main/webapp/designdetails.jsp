<%-- 
    Document   : designdetails
    Created on : 23-11-2017, 22:28:50
    Author     : Jonas
--%>

<%@page import="logic.Design"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     
        
        <h1>Her er dit design</h1
        <% Design design = new Design();%>
        <h3>your height</h3><%out.print(session.getAttribute("height"));%>
        <h3>your length</h3> <%out.print(session.getAttribute("length"));%>
        <h3>your width</h3>  <%out.print(session.getAttribute("width"));%>
        <h3>your designame</h3> <%out.print(session.getAttribute("desingname"));%>
        <h3> your id</h3> <%out.print(session.getAttribute("userid"));%>
  
    </body>
</html>
