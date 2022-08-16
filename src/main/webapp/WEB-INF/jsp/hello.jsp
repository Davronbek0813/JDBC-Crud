<%--
  Created by IntelliJ IDEA.
  User: msii
  Date: 8/16/2022
  Time: 10:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>SPRING MVC</title>

</head>
<body>
<c:forEach items="${names}" var="name">
  <p>${name}</p>
</c:forEach>

</body>
</html>
