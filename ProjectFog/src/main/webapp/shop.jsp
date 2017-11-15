<%-- 
    Document   : shop
    Created on : 09-11-2017, 13:29:47
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
        <h1>Shop</h1>
      
  
    
        <form action="shopsController">
            <input type="text" name="height" value="height"/><br>
            <input type="text" name="width" value="width"/><br>
            <input type="text" name="length" value="length"/><br>
            <select name="rooftype">
                <option>Oblique roof</option>
                <option>flat roof</option>
            </select><br>
            <input type="submit" name="Submit" value="Submit"/>
        
        
        
        
        </form>
    
    
    </body>
</html>
