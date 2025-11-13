<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.mvc.model.Student" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Model View Example</title>
</head>
<body>
    <h2>Use of ModelAndView</h2>
    
    <%
    String name=(String)request.getAttribute("name");
    Long mobile =(Long)request.getAttribute("mobile");
   Student student =(Student)request.getAttribute("studentData");
    List<Integer> pincodes =(List<Integer>)request.getAttribute("pincodes");
    %>
    
    
    
    
    <h3>Basic Data:</h3>
    Name: <%= name %> <br>
    Mobile: <%= mobile %> <br><br>

    <h3>Student Data:</h3>
    ID: <%= student.getId() %> <br>
    Name: <%= student.getName() %> <br>
    Roll Number: <%= student.getRegisterId() %> <br><br>

    <h3>Pincodes:</h3>
    <ul>
        <%
    
            for(Integer pin : pincodes){
        %>
            <li><%= pin %></li>
        <%
            }
        %>
    </ul>
</body>
</html>
