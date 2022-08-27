<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 27-Aug-22
  Time: 2:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="includes/regLoginHead.jsp"%>
<div class="content">
    <div id="id03" class="modal">
        <a href="./"> <span class="close" onclick="" title="Close Form">&times;</span></a>
        <%--        //onclick go to home page--%>

        <form class="modal-content" action="verifyMail" method="post" enctype='multipart/form-data'>

            <!----------container that contain form input fields--------->
            <div class="container">
                <h3>We have sent verification code to your email address. Provide this verification code here:</h3>
                <input type="number" id="verify_code" name="verify_code" required>
                <button type="submit">Verify</button>
            </div>
        <!-- End of container div -->
        </form>
    </div>

</div>
<%@include file="includes/footer.jsp"%>
