<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.mvcormdata.entity.Books"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Book</title>

<!-- Improved Internal CSS -->
<style>
    body {
        font-family: "Segoe UI", Tahoma, sans-serif;
        background: linear-gradient(to right, #ece9e6, #ffffff);
        margin: 0;
        padding: 0;
    }

    h2 {
        color: #333;
        font-size: 26px;
        margin-top: 40px;
        text-transform: uppercase;
        letter-spacing: 1px;
        text-align: center;
    }

    form {
        width: 420px;
        margin: 40px auto;
        padding: 30px;
        background: #fff;
        border-radius: 10px;
        box-shadow: 0 6px 18px rgba(0, 0, 0, 0.1);
        animation: fadeIn 0.6s ease;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    input[type="text"] {
        width: 100%;
        padding: 12px 14px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 15px;
        box-sizing: border-box;
        transition: all 0.25s ease;
    }

    input[type="text"]:focus {
        border-color: #4CAF50;
        box-shadow: 0 0 5px rgba(76, 175, 80, 0.4);
        outline: none;
    }

    input[readonly] {
        background-color: #f7f7f7;
        cursor: not-allowed;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background: #4CAF50;
        color: white;
        border: none;
        border-radius: 6px;
        font-size: 17px;
        cursor: pointer;
        margin-top: 15px;
        transition: background 0.3s ease, transform 0.2s ease;
    }

    input[type="submit"]:hover {
        background: #45a049;
        transform: translateY(-2px);
    }

    input[type="submit"]:active {
        transform: translateY(0px);
    }
</style>

</head>
<body>

<%
    Books book = (Books) request.getAttribute("bookDetails");
%>

<h2>Update Book Details</h2>

<form action="../updateSuccess" method="post">

    <input type="text" name="bookId" value="<%= book.getBookId() %>" readonly="true">

    <input type="text" name="bookName" value="<%= book.getBookName() %>" required>

    <input type="text" name="bookAuthor" value="<%= book.getBookAuthor() %>" required>

    <input type="text" name="bookDescription" value="<%= book.getBookDescription() %>" required>

    <input type="text" name="bookPrice" value="<%= book.getBookPrice() %>" required>

    <input type="submit" value="Update Book Details">

</form>

</body>
</html>
