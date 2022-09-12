<%-- 
    Document   : user_profile
    Created on : Aug 26, 2022, 1:53:12 AM
    Author     : Mestu
--%>

<%@include file="../includes/head.jsp"%>

<style>
    <%@include file="../assets/profileView.css"%>
</style>

<div class="content">
   <c:if test="${not empty sessionScope.adviserProfile}">
       <div class="photo">
           <img height="120" width="120" src="data:image/jpg;base64,${sessionScope.adviserProfile.getPhotoString()}" alt="profile picture"/>
       </div>
       <div class="info">
           <table>
               <tr>
                   <th>Name</th>
                   <td><c:out value="${sessionScope.adviserProfile.getName()}"/></td>
               </tr>
               <tr>
                   <th>E-mail</th>
                   <td> <c:out value="${sessionScope.adviserProfile.getEmail()}"/></td>
               </tr>
               <tr>
                   <th>Occupation</th>
                   <td><c:out value="${sessionScope.adviserProfile.getOccupation()}"/></td>
               </tr>
<%--               <tr>--%>
<%--                   <th>Present Address</th>--%>
<%--                   <td><c:out value="${sessionScope.adviserProfile.getPresentAddr}"/></td>--%>
<%--               </tr>--%>
<%--               <tr>--%>
<%--                   <th>Permanent Address</th>--%>
<%--                   <td><c:out value="${sessionScope.adviserProfile.getPresentAddr}"/></td>--%>
<%--               </tr>--%>
           </table>

           <div class="edit">
               <button>Update Information</button>
               <a href="logout"><button style="background-color:#ad2a2a">Logout</button></a>
           </div>
       </div>
   </c:if>
    <c:if test="${not empty sessionScope.userProfile}">
        <div class="photo">
            <img height="120" width="120" src="data:image/jpg;base64,${sessionScope.userProfile.getPhotoString()}" alt="profile picture"/>
        </div>
        <div class="info">
            <table>
                <tr>
                    <th>Name</th>
                    <td><c:out value="${sessionScope.userProfile.getName()}"/></td>
                </tr>
                <tr>
                    <th>ID</th>
                    <td><c:out value="${sessionScope.userProfile.getId()}"/></td>
                </tr>
                <tr>
                    <th>E-mail</th>
                    <td> <c:out value="${sessionScope.userProfile.getEmail()}"/></td>
                </tr>
            </table>
            <div class="edit">
                <button>Update Information</button>
                <a href="logout"><button style="background-color:#ad2a2a">Logout</button></a>
            </div>
        </div>
    </c:if>
</div>




<%@ include file="../includes/footer.jsp"%>
