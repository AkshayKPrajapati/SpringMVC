<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Page</title>

<!-- ========== Internal CSS ========== -->
<style>
    body {
        background-color: #f8d7da;
        font-family: Arial, sans-serif;
        padding: 40px;
        color: #721c24;
    }

    h1 {
        font-size: 32px;
        font-weight: bold;
        margin-bottom: 10px;
    }

    h2 {
        background-color: #f5c6cb;
        padding: 15px;
        border-left: 5px solid #721c24;
        border-radius: 5px;
        font-size: 20px;
    }
</style>
</head>
<body>

<%
    String msg = (String) request.getAttribute("msg");
%>

<h1>Error... Something went wrong</h1>
<h2>The Exception is: <%= msg %></h2>

</body>
</html>
