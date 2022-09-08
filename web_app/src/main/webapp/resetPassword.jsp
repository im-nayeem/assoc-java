<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 09-Sep-22
  Time: 12:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 25-Aug-22
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="./includes/regLoginHead.jsp"%>
<div class="content">
    <div class="modal" id="id02">

        <a href="./"><span onclick="" class="close" title="Close Form">&times;</span></a>
        <%--            onclick go to home page--%>

        <form class="modal-content" action="reset" method="post">
            <div class="container">
                <h3>Reset Password</h3>
                <br>
                <div class="error_message">
                        <c:if test="${not empty requestScope.login_error}">
                            <div style="color:darkred;"><c:out value="${requestScope.login_error}"/></div>
                        </c:if>
                </div>
                <hr>
                <input type="hidden" value="${role}" name="role" id="role">

                <label for="email"><strong>Email</strong></label>
                <input type="email" placeholder="Email" name="email" id="email" required>

                <label for="password"><strong>New Password</strong></label>
                <input type="password" id="password" name="password" placeholder="Password">

                <div id="warn_mismatched_pass">

                </div>

                <label for="confirm_pass"><strong>Confirm New Password</strong></label>
                <input type="password" id="confirm_pass" name="confirm_pass" placeholder="New Password">

                <div class="clearfix">
                    <button type="submit" class="submitbtn">Submit</button>
                </div>

            </div>
        </form>
    </div>

</div>

<%@include file="./includes/footer.jsp"%>
