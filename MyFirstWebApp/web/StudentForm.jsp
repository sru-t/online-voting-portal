<%-- 
    Document   : StudentForm
    Created on : Feb 6, 2016, 12:15:47 PM
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
        <%
        
        %>
        <form action="StudentServlet" method="post">
            First name:  <input type="text" name="first_name"  />
            Last name:   <input type="text" name="last_name" />
            <br>
            Address:  <input type="text" name="address"  />
            <br>
            Roll No.:    <input type="text" name="roll_no"  />
            <br>
            Year/Part:   <input type="text" name="year/part"  />
            <br>
            Program:     <input type="text" name="program"  />
            <br>
            
            Select gender
            <br>
            <input type="checkbox" name="female" value="on"> female
            <input type="checkbox" name="male" value="on"> male
            <br>
             <input type="submit" value="Submit">

        </form>
    </body>
</html>
