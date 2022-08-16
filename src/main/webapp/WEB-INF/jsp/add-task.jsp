<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add new todo</title>
</head>
<body>
<h1>Add new todo</h1>

<form action="/todos" method="post">
    <br>
    <label for="description">Description:</label>
    <input type="text" id="description" name="description" placeholder="Enter description" required>
    <br>
    <br>
    <label for="startdate">Start date:</label>
    <input type="datetime-local" id="startdate" name="startdate" >
    <br>
    <br>
    <label for="enddate">End date:</label>
    <input type="datetime-local" id="enddate" name="enddate">

    <br><br>
    <input type="submit" value="Saqlash">
    <br>
    <br>
    <a href="/todos">View todos</a>


</form>

</body>
</html>