<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Students</title>

</head>
<body>
<ol>
    <c:forEach items="${studs}" var="stud">
        <li>${stud}&nbsp;&nbsp;&nbsp; <a href="delete?name=${stud.name}&id=${stud.id}&dept=${stud.dept}">Delete</a> </li>
    </c:forEach>
</ol>
<a href="./">Add</a>

</body>
</html>
