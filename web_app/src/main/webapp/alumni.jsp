<%-- 
    Document   : alumni.jsp
    Created on : Sep 12, 2022, 4:32:40 AM
    Author     : Mestu
--%>

<%@include file="includes/head.jsp"%>
<style>
    <%@include file="../assets/members.css"%>
    button{
        background: #f1f1f1;
        padding: 3px;
        border-color: #c1c1c1;
    }
    .paragraph{
        background:white;
        width: max-content;
        height: max-content;
        padding:10px;
        font-weight: 600;
        margin:20px auto;
    }
</style>
<div class="content homepage" id="content">
    <c:choose>
        <c:when test="${requestScope.alumniList.size() <1}">
            <p class="paragraph">No Alumni</p>
        </c:when>
        <c:otherwise>
            <table class="assoc-member-table">
                <tr>
                    <th>Image</th>
                    <th>Name</th>
                    <c:if test="${not empty sessionScope.userProfile.getName()}">
                    <th>Email</th>
                    </c:if>
                    <th>Department</th>
                    <c:if test="${not empty sessionScope.userProfile.getName()}">
                    <th>Session</th>
                    <th>Occupation</th>
                    <th>Job Location</th>
                    </c:if>
                </tr>
                <c:forEach var="i" begin="0" end="${requestScope.alumniList.size()-1}">
                    <tr>
                        <td><img width="70px" height="70px" src="data:image/jpg;base64,${requestScope.alumniList[i].getPhotoString()}" alt="${requestScope.alumniList[i].getName()}"/></td>
                        <td><c:out value="${requestScope.alumniList[i].getName()}"/></td>
                        <c:if test="${not empty sessionScope.userProfile.getName()}">
                        <td><c:out value="${requestScope.alumniList[i].getEmail()}"/></td>
                        </c:if>
                        <td><c:out value="${requestScope.alumniList[i].getDept()}"/></td>
                        <c:if test="${not empty sessionScope.userProfile.getName()}">
                        <td><c:out value="${requestScope.alumniList[i].getSession()}"/></td>
                        <td><c:out value="${requestScope.alumniList[i].getOccupation()}"/></td>
                        <td><c:out value="${requestScope.alumniList[i].getJobLocation()}"/></td>
                        </c:if>
                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>
</div>

<%@ include file="includes/footer.jsp"%>