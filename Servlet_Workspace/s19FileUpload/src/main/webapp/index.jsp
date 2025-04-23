<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<h2>Upload Files</h2>
	<form action="upload" method = "post" enctype = "multipart/form-data">
		<input type = "file" name = "files" multiple>
		<input type = "submit">
	</form>
</body>
</html>