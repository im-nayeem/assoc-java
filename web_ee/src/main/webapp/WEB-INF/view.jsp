<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Students</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.0.2/css/bootstrap.css">

</head>
<body>
<ol>
    <c:forEach items="${studs}" var="stud">
        <li>${stud}&nbsp;&nbsp;&nbsp; <a href="delete?name=${stud.name}&id=${stud.id}&dept=${stud.dept}">Delete</a> </li>
    </c:forEach>
</ol>
<a href="./">Add</a>

<script src="webjars/jquery/3.6.0/jquery.js"></script>
<script src="webjars/bootstrap/5.0.2/js/bootstrap.js"></script>
</body>
</html>
