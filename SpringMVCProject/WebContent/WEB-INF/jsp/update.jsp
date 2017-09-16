<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Page</title>
</head>
<body>
<h1>${message}</h1>
<h2>If you want to update data please enter details</h2>

<pre>
 <form action="hellopageupdate", method="post">
 <table>
<tr><td><b>ID</b>     <input type="text" name="id"> </td></tr><br><br>
<tr><td><b>Name</b>   <input type="text" name="name"></td></tr><br><br>
<tr><td><b>Salary</b> <input type="text" name="salary"></td></tr><br><br>
<tr><td><b><input type="submit"></b></td></tr>
</table>
 </form>  
</pre>
<a href="./hellopage">Insert</a><br>
<a href="./delete">Delete</a><br>
<a href="index.jsp">Home</a><br>
</body>
</html>