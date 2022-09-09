<%-- 
    Document   : verifiedMembers
    Created on : Sep 8, 2022, 11:22:55 PM
    Author     : Mestu
--%>

<%@include file="includes/adminHead.jsp"%>
<style>
    <%@include file="assets/members.css"%>
</style>
<div class="content">
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
                <!--get details information of member using email-->
                <td><a href="AdminMembersDetails?email=${assocMember.getEmail()}&type=verified">Details</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
