<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 07-Sep-22
  Time: 12:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="./includes/head.jsp"%>

<style>
<%--    <%@include file=""%>--%>
</style>

<div class="content">
    
    <table class="assoc-member-table">
        <tr>
            <th>Image</th>
            <th>Name</th>
            <th>Email</th>
            <th>Department</th>
            <th>Batch</th>
        </tr>
        <c:forEach var="assocMember" items="${sessionScope.assocMemberList}">
        <tr>
            <td><img width="70px" height="70px" src="data:image/jpg;base64,${assocMember.getPhotoString()}" alt="${assocMember.getName()}"/></td>
            <td><c:out value="${assocMember.getName()}"/></td>
            <td><c:out value="${assocMember.getEmail()}"/></td>
            <td><c:out value="${assocMember.getDept()}"/></td>
            <td><c:out value="${assocMember.getBatch()}"/></td>
        </tr>
        </c:forEach>
    </table>
</div>

<%@include file="./includes/footer.jsp"%>

