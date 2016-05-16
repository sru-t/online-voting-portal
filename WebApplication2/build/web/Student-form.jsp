<%-- 
    Document   : Student-form
    Created on : May 14, 2016, 9:02:15 AM
    Author     : windows10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! // declarative tag.can make method. can do all that is allowed to do in class.
        String name="rashmi";
        
        public void studentName(){
         System.out.println(name);
        }
          
        
        %>
        
        <% //Scriptlet tag. It is defined within method. cant make method. can only do what is allowed to do in method.
        out.println("Rashmi Tiwari");
        %>
        
        <%= //it is itself like println  so no need to write semicolon after "name".
                name %>  
        <h1>Student-form page</h1>
    </body>
</html>
