<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.mvcormdata.entity.Login"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Details</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f7f7f7;
        padding: 20px;
    }
    h1, h3 {
        text-align: center;
        color: #333;
    }
    table {
        width: 70%;
        margin: 20px auto;
        border-collapse: collapse;
        background: #fff;
        box-shadow: 0px 0px 8px rgba(0,0,0,0.1);
    }
    th, td {
        padding: 12px;
        border: 1px solid #ddd;
        text-align: center;
        font-size: 14px;
    }
    th {
        background: #4CAF50;
        color: white;
        letter-spacing: 1px;
    }
    tr:nth-child(even) {
        background: #f2f2f2;
    }
    tr:hover {
        background: #e6ffe6;
    }
</style>

</head>
<body>

<h1>Login Data Successfully Loaded</h1>

<%
    List<Login> lists = (List<Login>) request.getAttribute("loginDetails");
%>

<h3>List of Login Details</h3>

<table>
    <tr>
        <th>User ID</th>
        <th>Username</th>
        <th>Password</th>
    </tr>

<% 
if(lists != null){
    for(Login list : lists){ %>
        <tr>
            <td><%= list.getUserid() %></td>
            <td><%= list.getUsername() %></td>
            <td><%= list.getPassword() %></td>
        </tr>
<%
    }
}
%>
</table>

</body>
</html>
