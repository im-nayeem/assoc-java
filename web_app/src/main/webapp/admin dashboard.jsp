<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 07-Sep-22
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="includes/adminHead.jsp"%>
<style>
    <%@include file="assets/adminDashboard.css"%>

</style>
<div class="content">
<div class="update">
    <a href=""><button>Update Association Information</button></a>
    <a href=""><button>Update Institution Information</button></a>
</div>
    <div class="stat">
        <h3>Total Members: ${sessionScope.totalVerified}</h3>
        <h3>Total Registered Members(Not Verified): ${sessionScope.totalMembers- sessionScope.totalVerified} </h3>
    </div>
</div>
</body>
</html>