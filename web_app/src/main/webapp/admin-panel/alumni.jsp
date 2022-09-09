<%-- 
    Document   : alumni
    Created on : Sep 9, 2022, 7:35:56 PM
    Author     : Mestu
--%>


<%@include file="../includes/adminHead.jsp"%>
<style>
    <%@include file="../assets/members.css"%>
    button{
        background: #f1f1f1;
        padding: 3px;
        border-color: #c1c1c1;
    }
</style>
<div class="content">
    <table class="assoc-member-table">
        <tr>
            <th>Image</th>
            <th>Name</th>
            <th>Email</th>
            <th>Department</th>
            <th>Session</th>
            <th>Occupation</th>
            <th>Job Location</th>
            <th>Update</th>
        </tr>
        <c:forEach var="i" begin="0" end="${requestScope.alumniList.size()-1}">
            <tr>
                <td><img width="70px" height="70px" src="data:image/jpg;base64,${requestScope.alumniList[i].getPhotoString()}" alt="${requestScope.alumniList[i].getName()}"/></td>
                <td><c:out value="${requestScope.alumniList[i].getName()}"/></td>
                <td><c:out value="${requestScope.alumniList[i].getEmail()}"/></td>
                <td><c:out value="${requestScope.alumniList[i].getDept()}"/></td>
                <td><c:out value="${requestScope.alumniList[i].getSession()}"/></td>
                <td><c:out value="${requestScope.alumniList[i].getOccupation()}"/></td>
                <td><c:out value="${requestScope.alumniList[i].getJobLocation()}"/></td>
                <td style="text-align: center;">
                    <button onclick="confirmDelete(${i}, ${requestScope.alumniList.size()})">Remove</button>
                    <a id="confirm${i}" style="display:none;" href="RemoveAlumni?email=${requestScope.alumniList[i].getEmail()}">
                        <button style="color:red">Confirm Remove</button>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<script>
    function confirmDelete(id, numberOfId) {
        const confirmId = document.getElementById("confirm" + id);
        if (confirmId.style.display === "block") {
            confirmId.style.display = "none";
            return;
        }
        for (var i = 0; i < numberOfId; i++) {
            var Id = document.getElementById("confirm" + i);
            Id.style.display = "none";
            console.log(id + " this " + Id);
        }
        confirmId.style.display = "block";
        console.log(id + " that " + confirmId);
    }
</script>
</body>
</html>
