<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help title here</title>
</head>
<body>


        <%
            String name = (String) request.getAttribute("name");
            Integer roll = (Integer) request.getAttribute("rollno");
        %>
        
        <h1>helo my name is <%= name %> and my roll no is <%= roll %></h1>
      
</body>
</html>