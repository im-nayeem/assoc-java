<%-- 
    Document   : memberDetails
    Created on : Sep 8, 2022, 3:42:22 AM
    Author     : Mestu
--%>


<%@include file="includes/head.jsp"%>
<style>
    <%@include file="assets/profileView.css"%>
</style>

<div class="content">
    <div class="photo">
        <img height="120" width="120" src="data:image/jpg;base64,${sessionScope.assocMemberDetails.getPhotoString()}" alt="Member Picture"/>
    </div>
    <div class="info">
        <table>
            <tr>
                <th>Name</th>
                <td><c:out value="${sessionScope.assocMemberDetails.getName()}"/></td>
            </tr>
            <tr>
                <th>Student ID</th>
                <td><c:out value="${sessionScope.assocMemberDetails.getId()}"/></td>
            </tr>
            <tr>
                <th>E-mail</th>
                <td> <c:out value="${sessionScope.assocMemberDetails.getEmail()}"/></td>
            </tr>
<%--            <tr>--%>
<%--                <th>Phone Number</th>--%>
<%--                <td> <c:out value="${sessionScope.assocMemberDetails.getPhone()}"/></td>--%>
<%--            </tr>--%>
            <tr>
                <th>Department</th>
                <td> <c:out value="${sessionScope.assocMemberDetails.getDept()}"/></td>
            </tr>
            <tr>
                <th>Session</th>
                <td> <c:out value="${sessionScope.assocMemberDetails.getSession()}"/></td>
            </tr>
            <tr>
                <th>Batch</th>
                <td> <c:out value="${sessionScope.assocMemberDetails.getBatch()}"/></td>
            </tr>
            <tr>
                <th>Gender</th>
                <td> <c:out value="${sessionScope.assocMemberDetails.getGender()}"/></td>
            </tr>
            <tr>
                <th>Blood Group</th>
                <td> <c:out value="${sessionScope.assocMemberDetails.getBloodGroup()}"/></td>
            </tr>
            <tr>
                <th>Co-Curricular Activities</th>
                <td> <c:out value="${sessionScope.assocMemberDetails.getCoActivity()}"/></td>
            </tr>
            <tr>
                <th>Current Living Area</th>
                <td> <c:out value="${sessionScope.assocMemberDetails.getPresentArea()}"/></td>
            </tr>

            <tr>
                <th>Permanent Upazila</th>
                <td> <c:out value="${sessionScope.assocMemberDetails.getPermanentUpazila()}"/></td>
            </tr>

        </table>
    </div>
</div>

<%@ include file="includes/footer.jsp"%>