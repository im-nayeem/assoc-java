<%-- 
    Document   : user_profile
    Created on : Aug 26, 2022, 1:53:12 AM
    Author     : Mestu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="includes/head.jsp"%>

<style>
    <%@include file="assets/dashboard.css"%>
</style>

<div class="content">
    <div class="photo">
        <img height="120" width="120" src="data:image/jpg;base64,${sessionScope.userProfile.getPhotoString()}" alt="profile picture"/>
    </div>
    <div class="info">
        <table>
            <tr>
                <th>Name</th>
                <td><c:out value="${sessionScope.userProfile.getName()}"/></td>
            </tr>
            <tr>
                <th>ID</th>
                <td><c:out value="${sessionScope.userProfile.getId()}"/></td>
            </tr>
            <tr>
                <th>E-mail</th>
                <td> <c:out value="${sessionScope.userProfile.getEmail()}"/></td>
            </tr>
        </table>
        <div class="edit">
            <button>Update Information</button>
            <a href="logout"><button style="background-color:#ad2a2a">Logout</button></a>
        </div>
    </div>
</div>




</div>

<%@ include file="includes/footer.jsp"%>
