<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f4f7ff;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .form-container {
        background: #ffffff;
        padding: 35px 40px;
        border-radius: 10px;
        box-shadow: 0 5px 18px rgba(0,0,0,0.12);
        width: 350px;
        text-align: center;
    }

    .form-container h1 {
        color: #0b5ed7;
        margin-bottom: 18px;
        font-size: 24px;
    }

    .form-container input[type="text"] {
        width: 100%;
        padding: 12px;
        margin: 10px 0;
        border: 1px solid #b5b5b5;
        border-radius: 6px;
        font-size: 14px;
        outline: none;
        transition: border 0.3s;
    }

    .form-container input[type="text"]:focus {
        border-color: #0b5ed7;
    }

    .form-container input[type="submit"] {
        width: 100%;
        padding: 12px;
        background: #0b5ed7;
        color: #fff;
        border: none;
        border-radius: 6px;
        font-size: 15px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s;
        margin-top: 12px;
    }

    .form-container input[type="submit"]:hover {
        background: #083f97;
    }
</style>

</head>
<body>

    <div class="form-container">
        <h1>Add New Book</h1>

        <form action="bookAddedSuccess" method="post">
            <input type="text" placeholder="Enter Book Name" id="bookName" name="bookName" required>

            <input type="text" placeholder="Enter Author Name" id="bookAuthor" name="bookAuthor" required>

            <input type="text" placeholder="Enter Description" id="bookDescription" name="bookDescription" required>

            <input type="text" placeholder="Enter Price (₹)" id="bookPrice" name="bookPrice" required>

            <input type="submit" value="Submit Book">
        </form>
    </div>

</body>
</html>
