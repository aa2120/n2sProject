<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CurrentDate and session</title>
</head>
<body>
Today's date: <%= (new java.util.Date())%><br>
Request Session ID:<%= request.getSession().getId()%>
</body>
</html>