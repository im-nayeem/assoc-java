

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
        <link href="WEB-INF/assets/css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1><%= "Hello World!"%>
        </h1>
        <br/>
        <a href="hello-servlet">Hello Servlet</a>
        <img src="data:image/jpg;base64,${requestScope.assocInfo.getAssocLogo()}"/>
    </body>
</html>