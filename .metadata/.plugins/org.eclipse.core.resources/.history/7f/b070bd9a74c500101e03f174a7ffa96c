<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.mvcormdata.entity.Books"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Book</title>
</head>
<body>

<%
    Books book = (Books) request.getAttribute("bookDetails");
%>

<center>
    <h2>Update Book Details</h2>
</center>

<form action="update/book/updateSuccess" method="post">

    <input type="text" name="bookId" value="<%= book.getBookId() %>" readonly>

    <input type="text" name="bookName" value="<%= book.getBookName() %>" required>

    <input type="text" name="bookAuthor" value="<%= book.getBookAuthor() %>" required>

    <input type="text" name="bookDescription" value="<%= book.getBookDescription() %>" required>

    <input type="text" name="bookPrice" value="<%= book.getBookPrice() %>" required>

    <input type="submit" value="Update Book Details">

</form>


</body>
</html>
