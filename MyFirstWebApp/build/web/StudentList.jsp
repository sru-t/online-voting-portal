<%-- 
    Document   : StudentList
    Created on : Feb 6, 2016, 12:16:16 PM
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
            String firstName=request.getParameter("first_name");
            String lastName=request.getParameter("last_name");
            String address=request.getParameter("address");
            String rollno=request.getParameter("roll_no");
            String year=request.getParameter("year/part");
            String program=request.getParameter("program"); 
            out.println(firstName + lastName);
        %>
    </body>
</html>
