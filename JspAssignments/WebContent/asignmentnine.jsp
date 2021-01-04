<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String hostName=request.getServerName();%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Host name and path</title>
</head>
<body>
	Host Name of server: <%=hostName%>
	jsp path is: <%=request.getRealPath("asignmentnine.jsp")%>
</body>
</html>