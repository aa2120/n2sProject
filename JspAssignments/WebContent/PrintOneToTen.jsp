<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <H3 ALIGN="CENTER">
     Numbers from 1 to 10 : <br>
      <FONT COLOR="RED">
     
<% for(int i = 1; i <= 10; i++)
{
    System.out.println(i); //output will show in the console   
    out.println(i);// will print on the screen
}
%>
   </H3>
  </BODY>
</body>
</html>