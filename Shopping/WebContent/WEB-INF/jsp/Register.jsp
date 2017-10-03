<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Log-in</title>
  
  <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
  <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

      <link rel="stylesheet" href="css/style.css">

  <style>
    .error {
        color: red; font-weight: bold;
    }
</style>
</head>

<body>

  <div class="login-card">
    <h1>Registration</h1><br>
  <form action="registeruser" method="post">
  <form:errors path="userdata.fname" cssClass="error"/>
    <input type="text" name="fname" placeholder="First Name">
    <form:errors path="userdata.lname" cssClass="error" />
    <input type="text" name="lname" placeholder="Last Name">
    <form:errors path="userdata.email" cssClass="error" />
    <input type="text" name="email" placeholder="Email">
    <form:errors path="userdata.pass" cssClass="error"/>
    <input type="password" name="pass" placeholder="Password">
    <form:errors path="userdata.country" cssClass="error"/>
     <input type="text" name="country" placeholder="Country">
    
    <input type="submit" name="register" class="login login-submit" value="Register">
  </form>
    
  </div>

<!-- <div id="error"><img src="https://dl.dropboxusercontent.com/u/23299152/Delete-icon.png" /> Your caps-lock is on.</div> -->
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>

  
</body>
</html>
