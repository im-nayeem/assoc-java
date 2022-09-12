<%-- 
    Document   : userExecutiveMember
    Created on : Sep 11, 2022, 10:35:50 PM
    Author     : Mestu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="includes/head.jsp"%>
<style>
    <%@include file="assets/members.css"%>
    <%@include file="assets/adminExeMember.css"%>
    <%@include file="assets/notice.css"%>
    #newExecutiveCommittee{
        display:none;
    }
    #newExecutiveCommittee label{
        font-size: 16px;
        background: transparent;
    }

</style>
<div class="content" id="content">
    <!---------------------------- to view a committee ----------------------------->
    <p class="paragraph"><a id="viewForm">Show a specific committee info</a></p>
    <c:out value="${sessionScope.lastCommitteeId}"/>
    <c:if test="${not empty sessionScope.lastCommitteeId}">
        <form id="executiveCommitteeId" style="display:none" class="filter" action="ExecutiveCommitteeUser" method="post">
            <input type="hidden" name="type" value="filter"/>
            <select name="committeeNumber" id="committeeNumber" required>
                <option selected disabled hidden>Select Committee Number</option>
                <c:forEach var="i" begin="1" end="${sessionScope.lastCommitteeId-1}">
                    <option value="${i}"><c:out value="${i}"/></option>
                </c:forEach>
            </select>
            <button type="submit">Apply</button>
        </form>
    </c:if>

    <!------------------ show info to update committee ----------------->
    <c:if test="${not empty sessionScope.lastAddedList}">
        <form action="ExecutiveCommittee" method="post" class="info-update">
            <input type="hidden" name="type" value="update"/>
            <h1>Executive Committee</h1>

            <table class="assoc-member-table">
                <tr>
                    <th>Image</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Post Name</th>
                </tr>
                <c:forEach var="assocMember" items="${sessionScope.lastAddedList}">
                    <tr>
                        <td><img width="70px" height="70px" src="data:image/jpg;base64,${assocMember.getPhotoString()}" alt="${assocMember.getName()}"/></td>
                        <td><c:out value="${assocMember.getName()}"/></td>
                        <td><c:out value="${assocMember.getEmail()}"/></td>
                        <td>
                            <c:choose>
                                <c:when test="${not empty assocMember.getPostName()}">
                                    <c:out value="${assocMember.getPostName()}"/>
                                </c:when>
                                <c:otherwise>
                                    <c:out value="Not Provided"/>
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </form>
    </c:if>
</div>
<script>
    const viewForm = document.getElementById("viewForm");
    viewForm.addEventListener('click', viewFormFunction);

    function viewFormFunction() {
        document.getElementById("executiveCommitteeId").style.display = "block";
    }
</script>
<%@ include file="includes/footer.jsp"%>