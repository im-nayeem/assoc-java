<%-- 
    Document   : verifiedMembers
    Created on : Sep 8, 2022, 11:22:55 PM
    Author     : Mestu
--%>

<%@include file="includes/adminHead.jsp"%>
<style>
    <%@include file="assets/members.css"%>
    .assoc-member-table form input,button{
        background: none;
        padding: 5px;
        margin: 1px;
        color: blue;
    }
    .assoc-member-table form button{
        border: none;
        cursor: pointer;
        font-weight: bold;
        font-size:15px;
    }
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
            <th>Executive Member</th>
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
                <c:choose>
                    <c:when test="${assocMember.getIsAlumni()==true}">
                        <p style="background: transparent; font-weight: bold; color:green">Marked</p> 
                    </c:when>
                    <c:otherwise>
                        <c:if test="${not empty requestScope.addedEmail}">
                            <c:if test="${assocMember.getEmail() == requestScope.addedEmail}">
                            <lable style="color:white;">${requestScope.msg}</lable>
                            </c:if>
                        </c:if>
                        <form action="AdditionalInfo" method="post">
                            <input type="hidden" name="email" value="${assocMember.getEmail()}"/>
                            <input type="hidden" name="id" value="${assocMember.getId()}"/>
                            <input type="hidden" name="type" value="exeMember"/>
                            
                            <select style="background: white; padding: 5px;" name="addCommitteeTo" required>
                                <option style="background: white;" selected disabled hidden>Select committee Number</option>
                                <c:forEach var="cmi" begin="1" end="${sessionScope.lastCommitteeId-1}">
                                    <option style="background: white; padding: 5px;" value="${cmi}">${cmi}</option>
                                </c:forEach>
                            </select>
                            <a href=""><button style="cursor: pointer" type="submit">Mark</button></a>
                        </form>
                        
                    </c:otherwise>
                </c:choose> 


            </td>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
