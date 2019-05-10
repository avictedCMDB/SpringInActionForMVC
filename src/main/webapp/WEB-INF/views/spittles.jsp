<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: xulei
  Date: 2019/5/10/010
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>xuleixulei</h1>

    <div>
        <c:forEach items="${spittleList}" var="spittle">
           <li>
                <div><c:out value="${spittle.message}" /> </div>
                <div>
                    <span><c:out value="${spittle.time}"/></span>
                    <span><c:out value="${spittle.latitude}"/></span>
                    <span><c:out value="${spittle.longitude}"/></span>
                </div>
            </li>
        </c:forEach>
    </div>
</body>
</html>
