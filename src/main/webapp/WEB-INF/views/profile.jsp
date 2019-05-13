<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: xulei
  Date: 2019/5/13/013
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Your Profile</h1>
    <c:out value="${spitter.userName}" /><br />
    <c:out value="${spitter.firstName}" /><br />
    <c:out value="${spitter.password}" /><br />
</body>
</html>
