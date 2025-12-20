<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Upload</title>
</head>
<body>

<h2>Upload The File</h2>

<form action="uploadSuccess" method="post" enctype="multipart/form-data">
    <label>Upload the file</label>
    <input type="file" name="file" required><br><br>
    <button type="submit">Upload File</button>
</form>

</body>
</html>
