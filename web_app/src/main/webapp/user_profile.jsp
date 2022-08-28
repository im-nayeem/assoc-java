<%-- 
    Document   : user_profile
    Created on : Aug 26, 2022, 1:53:12 AM
    Author     : Mestu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% session.setAttribute("title", "MSWA");%>

<%@include file="includes/head.jsp"%>

<!--it is temporary--> 
<c:choose>
    <c:when test="${empty sessionScope.userProfile.getName()}">
        <div style="background: white; min-height: 80vh; text-align: center;">
            You are not log in yet
        </div>
    </c:when>
    <c:otherwise>
        <div style="background: white; min-height: 80vh; text-align: center;">
            <c:out value="${sessionScope.userProfile.getName()}"/><br> <br> 
            <c:out value="${sessionScope.userProfile.getId()}"/><br><br> 
            <c:out value="${sessionScope.userProfile.getEmail()}"/><br><br> 
            <img height="120" width="120" src="data:image/jpg;base64,${sessionScope.userProfile.getPhotoString()}" alt="profile picture"/>
            <a href="logout">Logout</a>
        </div>
    </c:otherwise>
</c:choose>


<%@ include file="includes/footer.jsp"%>
