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
    <%@include file="./assets/members.css"%>
    .content form{
        background: transparent;
        margin: 10px auto;
    }
    .filter-member{
        background: transparent;
        text-align: center;
    }
    .filter-member select{
        background: white;
        padding: 10px;
        
    }
    .filter-member select option{
        background: white;
        margin: 40px;
        font-size:18px;
        
    }
    .filter-member button{
        padding:10px 20px;
        background: #06c37d;
        color:white;
        font-size:15px;
        font-weight:500;
        border: 1px solid #2fad94;
    }
    .filter-member button:hover{
        background: #2e785d;
        color:white;
    }
</style>

<div class="content">
    <form action="members-filter" method="post">
        <div class="filter-member">
            <select name="dept" id="dept" required>
                <option selected disabled hidden>Select Department</option>
                <c:forEach var="dept" items="${sessionScope.memberFilterValue.getDeptList()}">
                    <option value="${dept}"><c:out value="${dept}"/></option>
                </c:forEach>
            </select>
            <select name="session" id="session" required>
                <option selected disabled hidden>Select Session</option>
                <c:forEach var="session" items="${sessionScope.memberFilterValue.getSessionList()}">
                    <option value="${session}"><c:out value="${session}"/></option>
                </c:forEach>
            </select>
            <select name="present_area" id="present_area" required>
                <option selected disabled hidden>Select Present Area</option>
                <c:forEach var="preArea" items="${sessionScope.memberFilterValue.getPresentAreaList()}">
                    <option value="${preArea}"><c:out value="${preArea}"/></option>
                </c:forEach>
            </select>
            <select name="permanent_upazila" id="upazila" required>
                <option selected disabled hidden>Select Upazila</option>
                <c:forEach var="upazila" items="${sessionScope.memberFilterValue.getPermanentUpazilaList()}">
                    <option value="${upazila}"><c:out value="${upazila}"/></option>
                </c:forEach>
            </select>
            <button type="submit">Apply</button>

        </div>
    </form>

    <table class="assoc-member-table">
        <tr>
            <th>Image</th>
            <th>Name</th>
            <th>Email</th>
            <th>Department</th>
            <th>Batch</th>
            <th>Details</th>
        </tr>
        <c:forEach var="assocMember" items="${sessionScope.assocMemberList}">
            <tr>
                <td><img width="70px" height="70px" src="data:image/jpg;base64,${assocMember.getPhotoString()}" alt="${assocMember.getName()}"/></td>
                <td><c:out value="${assocMember.getName()}"/></td>
                <td><c:out value="${assocMember.getEmail()}"/></td>
                <td><c:out value="${assocMember.getDept()}"/></td>
                <td><c:out value="${assocMember.getBatch()}"/></td>
                <td><a href="MemberDetails?email=${assocMember.getEmail()}">Details</a></td>
            </tr>
        </c:forEach>
    </table>
</div>

<%@include file="./includes/footer.jsp"%>

