<%-- 
    Document   : userdesigns
    Created on : 24-11-2017, 09:11:26
    Author     : Jonas
--%>

<%@page import="logic.Design"%>
<%@page import="data.DesignMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>list over userdesigns</h1>
        <% DesignMapper dm = new DesignMapper();%>
        <% for(Design design : dm.getAllDesigns()){
            out.print(design);
        }%>
        <h3>see single design </h3>
       
        <form action="SohwDesign" method="get">
            <input type="designid" value="designid" name="designid"><br>
            <input type="submit" value="Submit">
        </form>
        
    
    </body>
</html>
