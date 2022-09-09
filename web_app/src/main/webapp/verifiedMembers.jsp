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
            <th>Alumni</th>
            <th style="width:5%">Executive Member</th>
        </tr>
        <c:forEach var="assocMember" items="${sessionScope.assocMemberList}">
            <tr>
                <td><img width="70px" height="70px" src="data:image/jpg;base64,${assocMember.getPhotoString()}" alt="${assocMember.getName()}"/></td>
                <td><c:out value="${assocMember.getName()}"/></td>
                <td><c:out value="${assocMember.getEmail()}"/></td>
                <td><c:out value="${assocMember.getDept()}"/></td>
                <td><c:out value="${assocMember.getBatch()}"/></td>
                <!--get details information of member using email-->
                <input type="hidden" name="studentId" value="${assocMember.getId()}"/>
                <td><a href="AdminMembersDetails?email=${assocMember.getEmail()}&type=verified">Details</a></td>
                <td>
                    <c:choose>
                        <c:when test="${assocMember.getIsAlumni()==true}">
                            <p style="background: transparent; font-weight: bold; color:green">Marked</p> 
                        </c:when>
                        <c:otherwise>
                            <a href="AdditionalInfo?email=${assocMember.getEmail()}&studentId=${assocMember.getId()}&type=alumni">Mark</a>
                        </c:otherwise>
                    </c:choose> 
                </td>
                <td>
                    <a href="AdditionalInfo?email=${assocMember.getEmail()}&studentId=${assocMember.getId()}&type=exeMember">Mark</a>
                </td>
                
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
