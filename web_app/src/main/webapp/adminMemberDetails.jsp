<%-- 
    Document   : adminMemberDetails
    Created on : Sep 8, 2022, 11:43:52 PM
    Author     : Mestu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="includes/adminHead.jsp"%>
<style>
    <%@include file="assets/profileView.css"%>
    form{
        background: transparent;
        text-align: center;
    }
    form button{
        color:white;
        padding: 10px;
        font-weight:600;
        font-size:20px;
        margin:40px 10px 40px 10px;
        border:none;
    }

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
        <c:if test="${sessionScope.verified == 'no'}">
            <form action="VerifyMember" method="post">
                <input type="hidden" name="email" value="${sessionScope.assocMemberDetails.getEmail()}"/>
                <input type="hidden" name="id" value="${sessionScope.assocMemberDetails.getId()}"/>
                
                <button style="background: #079124;" name="isValid" value="yes" type="submit">Approve</button> <button style="background: #d91414;" name="isValid" value="no" type="submit">Reject</button>
            </form>
        </c:if>

    </div>
</div>
</body>
</html>