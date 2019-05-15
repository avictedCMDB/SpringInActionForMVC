<%--
  Created by IntelliJ IDEA.
  User: xulei
  Date: 2019/5/10/010
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Register</h1>
    <form method="post" enctype="multipart/form-data">
        First Name: <input type="text" name="firstName" /><br/>
        Last Name: <input type="text" name="lastName" /><br/>
        UserName: <input type="text" name="username" /><br/>
        Password: <input type="password" name="password" /><br/>
        File:<input type="multipartFile" name="profilePicture">
        <input type="submit" value="Register">
    </form>
</body>
</html>
