<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<br>
<p class="h2"><a href="/addtodo">Add todo</a> </p>

<br>
<br>
<h1>${status}</h1>



<table class="table table-dark">
    <tbody>
    <tr>
        <th>Id</th>
        <th>Description</th>
        <th>Start date</th>
        <td>End date</td>
        <td>Edite</td>
        <td>Delete</td>
    </tr>

    <c:forEach items="${listtodo}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.description}</td>
            <td>${list.startdate}</td>
            <td>${list.enddate}</td>
            <td><a href="/edite?id=${list.getId()}">Edit</a></td>
            <td><a href="/delete?id=${list.getId()}">Delete</a></td>

        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>