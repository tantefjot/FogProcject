<%-- 
    Document   : Login
    Created on : 20-11-2017, 08:59:10
    Author     : Rikke Nielsen 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
   
    <body
        <section id="main">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-md-offset-4">
                        <form  action="index.jsp" method="POST" class="well">
                            
                            <h2>Login</h2>
                            <div class="form-group">
                                <label>Username</label>
                                <input type="text" class="form-control" name="username" >
                            </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input type="password" class="form-control" name="password">
                            </div>
                            <button type="submit" class="btn btn-primary btn-block">Login</button>
                        </form>
                    </div>
                </div>
            </div>
        </section>




    </body>
</html>