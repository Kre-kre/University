<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nick
  Date: 8/9/2022
  Time: 5:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>STUDENT</h1>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Faculty</th>
    </tr>

        <c:url var="addFaculty" value="/addFaculty">
            <c:param name="studId" value="${student.id}"/>
        </c:url>

        <tr>
            <td>${student.name}</td>
            <td>${student.surname}</td>
                <%--            dropdown list faculty--%>
            <td>
                <input type="button" value="ADD"
                       onclick="window.location.href='${addFaculty}'">
            </td>
        </tr>


</table>
</body>
</html>
