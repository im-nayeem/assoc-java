<%-- 
    Document   : executiveMember
    Created on : Sep 10, 2022, 3:10:04 PM
    Author     : Mestu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../includes/adminHead.jsp"%>
<style>
    <%@include file="../assets/members.css"%>
    <%@include file="../assets/adminExeMember.css"%>
    <%@include file="../assets/notice.css"%>
    #newExecutiveCommittee{
        display:none;
    }
    #newExecutiveCommittee label{
        font-size: 16px;
        background: transparent;
    }

</style>

<div class="content">
    <p class="paragraph"><a href="#" id="addNewExecutiveCommittee">Add new Committee</a></p>


    <!----------------- to add new committee read start and end time ---------------------->
    <form id="newExecutiveCommittee" action="ExecutiveCommittee" method="post" class="info-update" onsubmit="return validateDate()">
        <input type="hidden" name="type" value="newExecutiveCommittee"/>

        <label style="font-size:25px; font-weight: bold; width:26%; margin: 0% 37%; f" >You are adding ${sessionScope.lastCommitteeId}<sup style="background:transparent">th</sup> committee</label><br><hr>
        <div  class="start-end-time">
            <li>
                <label>Start time of committee</label>
                <input id="from_time" type="date" name="from_time" required value=""/>
            </li>
            <li>
                <label>End time of committee</label>
                <input id="to_time" type="date" name="to_time" placeholder="End time of this committee" required value=""/>
            </li>

        </div><br><br>
        <button type="submit">Submit</button>
    </form>


    <!---------------------------- to update a committee read a committee info ----------------------------->
    <p class="paragraph"><a href="#"  onclick="hideForm()">Update committee info</a></p>
    <form id="updateExecutiveCommittee" style="display:none" class="filter" action="ExecutiveCommittee" method="post">
        <input type="hidden" name="type" value="filter"/>
        <select name="committeeNumber" id="committeeNumber" required>
            <option selected disabled hidden>Select Committee Number</option>
            <c:forEach var="i" begin="1" end="${sessionScope.lastCommitteeId-1}">
                <option value="${i}"><c:out value="${i}"/></option>
            </c:forEach>
        </select>
        <button type="submit">Apply</button>
    </form>


    <!------------------ show info to update committee ----------------->

    <c:if test="${not empty sessionScope.lastAddedList}">
        <form action="ExecutiveCommittee" method="post" class="info-update">
            <input type="hidden" name="type" value="update"/>
            <h1> Update Executive Committee</h1>

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
                                    <input type="text" name="${assocMember.getId()}postName" value="${assocMember.getPostName()}" placeholder="Enter post name" required/>
                                </c:when>
                                <c:otherwise>
                                    <input type="text" name="${assocMember.getId()}postName" placeholder="Enter post name" required/>
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <button type="submit">Submit</button>
        </form>
    </c:if>




</div>
<script>
    const addNewExecutiveCommittee = document.getElementById("addNewExecutiveCommittee");
    addNewExecutiveCommittee.addEventListener('click', showForm);
    function showForm() {
        document.getElementById("updateExecutiveCommittee").style.display = "none";
        if (document.getElementById("newExecutiveCommittee").style.display === "block")
            document.getElementById("newExecutiveCommittee").style.display = "none";
        else {
            document.getElementById("newExecutiveCommittee").style.display = "block";
        }
    }
    function hideForm() {
        document.getElementById("newExecutiveCommittee").style.display = "none";
        if (document.getElementById("updateExecutiveCommittee").style.display === "none") {
            document.getElementById("updateExecutiveCommittee").style.display = "block";
        } else {
            document.getElementById("updateExecutiveCommittee").style.display = "none";
        }
    }
    function validateDate() {
        var startDate = new Date(document.getElementById("from_time").value);
        var endDate = new Date(document.getElementById("to_time").value);
        if(startDate > endDate){
            alert("Start-Date is greater than End-Date");
            return false;
        }
        if(endDate < new Date()){
            alert("End-Date is smaller than Today");
            return false;
        }
//        var current_status = document.forms["nameform"]["status"].value;
//        var default_value = ['passive', 'dead'];
//        if (!default_value.includes(current_status)) {
//            alert("You are not allowed to continue");
//            return false;
//        }
    }
</script>

</body>
</html>
