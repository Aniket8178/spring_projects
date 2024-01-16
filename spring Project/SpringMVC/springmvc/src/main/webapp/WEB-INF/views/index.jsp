<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <h1>this is home pgae index</h1>
      <h1>call by home controller</h1>
      <h1>urm/heihi</h1>
      
      <%
          String name = (String)request.getAttribute("name");
          List<String> friends = (List<String>) request.getAttribute("f");
      %>
      <h1>Name is <%= name%></h1>
      
      <%
         for(String s : friends){
      %>
      
       <h1><%=s%></h1>
       
      <%
         }
      %>
      
</body>
</html>