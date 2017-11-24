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
      <% Design design = new Design();%>
      user design by designid <%out.print(session.getAttribute("designid"));%>
     <h3> height</h3><%out.print(design.getHeight());%>
        <h3> length</h3> <%out.print(design.getLength());%>
        <h3> width</h3>  <%out.print(design.getWidth());%>
        <h3> designame</h3> <%out.print(design.getName());%>
        <h3> id</h3> <%out.print(design.getUser_id());%><br>
        
        godkend design <button> godkend</button><br>
        avis design <button> avis</button><br>
        ret og send tilbage til kunden <button> ret og send</button><br>
       
    </body>
</html>
