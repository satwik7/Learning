<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<h2>WelCome to Shopping</h2>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
button{
background-color: #4caf50;
color: white;
padding: 40px 20px;
margin: 30px 20px;
border: none;
cursor : pointer;
width : 20%;
}
body{
background-color: #cccccc;
}
</style>
</head>
<body background="<c:url value='/resources/images/shopping2.jpg'/>">
<table><tr>
<form action="./admin"><button type="submit"><h1>Admin</h1></button></form>
<form action="./user"><button type="submit"><h1>User</h1></button></form>
</tr>
</table>
</body>
</html>