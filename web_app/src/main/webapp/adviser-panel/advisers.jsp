<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 09-Sep-22
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../includes/head.jsp"%>
<style>
    <%@include file="../assets/manageAdvisors.css"%>
</style>
<div class="content">
    <c:forEach var="advisor" items="${adviserList}">
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
                </table>
            </div>
        </div>

    </c:forEach>
</div>
<%@include file="../includes/footer.jsp"%>
