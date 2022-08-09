<%@ taglib prefix="securit" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Nick
  Date: 8/9/2022
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WELCOME</title>
</head>
<body>
<br>
WELCOME
<br><br>
<securit:authorize access="hasRole('STUDENT')">
    <input type="button" value="Student"
           onclick="window.location.href='student_info'">
</securit:authorize>
<br><br>
<securit:authorize access="hasRole('TEACHER')">
    <input type="button" value="Teacher"
           onclick="window.location.href='teacher_info'">
</securit:authorize>
</body>
</html>
