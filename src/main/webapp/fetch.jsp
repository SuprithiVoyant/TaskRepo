<%@page isELIgnored="false" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Records</title>
</head>
<body>
    <h1>Employee Records Table</h1>
    <h3>${success}</h3>
    <table>
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Salary</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <x:forEach var="emp" items="${list}">
        <tr>
            <td>${emp.name}</td>
            <td>${emp.email}</td>
            <td>${emp.mobile}</td>
            <td>${emp.salary}</td>
            <td><a href="#"><button>Delete</button></a></td>
            <td><a href="#"><button>Edit</button></a></td>
        </tr>
        </x:forEach>
    </table>
    <a href="home"><button>Back</button></a>
</body>
</html>
