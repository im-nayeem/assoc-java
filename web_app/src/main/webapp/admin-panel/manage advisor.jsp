<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 09-Sep-22
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../includes/adminHead.jsp"%>
<style>
    <%@include file="../assets/manageAdvisors.css"%>
</style>

<div class="content">
    <div class="edit">
        <a href="ManageAdvisor?t=add"> <button>Add New Advisor</button></a>
    </div>
    <c:forEach var="advisor" items="${advisorList}">
        <div class="advisor">

            <div class="photo">
                <c:if test="${not empty advisor.getPhotoString()}">
                <img height="120" width="120" src="data:image/jpg;base64,${advisor.getPhotoString()}" alt="photo"/>
                </c:if>
            </div>

            <div class="info">
                <table>
                    <tr>
                        <th>Name</th>
                        <td><c:out value="${advisor.getName()}"/></td>
                    </tr>
                    <tr>
                        <th>E-mail</th>
                        <td> <c:out value="${advisor.getEmail()}"/></td>
                    </tr>
                    <tr>
                        <th>Occupation</th>
                        <td> <c:out value="${advisor.getOccupation()}"/></td>
                    </tr>
                    <tr>
                        <th>Present Address</th>
                        <td> <c:out value="${advisor.getPresentAddr()}"/></td>
                    </tr>
                    <tr>
                        <th>Permanent Address</th>
                        <td> <c:out value="${advisor.getPermanentAddr()}"/></td>
                    </tr>
                </table>
            </div>
            <div class="edit">
                <a href="Delete?role=advisor&email=${advisor.getEmail()}">
                    <button style="background-color:#ad2a2a">Delete</button>
                </a>
            </div>
        </div>

    </c:forEach>
</div>

</body>
</html>
