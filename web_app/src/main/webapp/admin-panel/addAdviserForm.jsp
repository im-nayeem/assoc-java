<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 09-Sep-22
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="../includes/regLoginHead.jsp"%>
<div class="content">
    <div class="modal" id="id09">

        <a href="admin-panel"><span onclick="" class="close" title="Close Form">&times;</span></a>
        <%--            onclick go to home page--%>

        <form class="modal-content" action="AddAdviser" method="post">
            <div class="container">
                <h3>Add Advisor</h3>
                <br>
                <hr>
                <label for="name"><strong>Name</strong></label>
                <input type="text" placeholder="Name" name="name" id="name" pattern="[A-Za-z ]+" required>

                <label for="email"><strong>Email</strong></label>
                <input type="email" placeholder="Email" name="email" id="email" required>

                <label for="from_time"><strong>From Time</strong></label>
                <input type="date" id="from_time" name="from_time">

                <label for="to_time"><strong>From Time</strong></label>
                <input type="date" id="to_time" name="to_time">


                <div class="clearfix">

                    <button type="submit" class="submitbtn">Submit</button>
                </div>
            </div>
        </form>
    </div>

</div>

<%@include file="../includes/footer.jsp"%>

