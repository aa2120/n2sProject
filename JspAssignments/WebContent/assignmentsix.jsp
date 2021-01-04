<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sum from 1 to 25</title>
</head>
<body>
<%
int number = 25;
int sum = 0;
	for (int i=1; i <= number; ++i)
	{
		sum +=i;
	}
	out.println("The sum of numbers from 1 to 25 is equal to = " + sum);
%>

</body>
</html>