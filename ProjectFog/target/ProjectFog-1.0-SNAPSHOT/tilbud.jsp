<%-- 
    Document   : tilbud
    Created on : 09-11-2017, 14:21:24
    Author     : Jonas
--%>

<%@page import="java.util.List"%>
<%@page import="entity.Order"%>
<%@page import="data.OrderMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>dit tilbud</h1>
     
        <%Order o = new Order(); %>
        
       
        
                <%
                                                OrderMapper om = new OrderMapper();
                                                List<Order> theorders = om.getOrderByUser_id(1);
                                                for ( Order orders : theorders) {
                                                    
                                                         
                                               
                                                    
                                                    out.print("<option value=\"" + orders.getRooftype() + "\">" + orders.getHeigth() + ": " + orders.getLength() + orders.getOrder_id() +orders.getWidth() +orders.getUser_id() + "</option>");
                                               
                                                }
                                             

                                            %>
        
        
  
    </body>
</html>
