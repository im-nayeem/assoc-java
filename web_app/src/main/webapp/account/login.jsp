<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 25-Aug-22
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/regLoginHead.jsp"%>
<div class="content">
    <div class="modal" id="id02">

        <a href="./"><span onclick="" class="close" title="Close Form">&times;</span></a>
<%--            onclick go to home page--%>

        <form class="modal-content" action="Login" method="post">
            <div class="container">
                <h3>Log In</h3>
                <br>
                <div class="error_message">
                    <c:choose>
                        <c:when test="${requestScope.isRegistrationCompleted==true}">
                            <div style="color:green;">You've resgistered successfully. Wait for admin verification process. You can log-in after getting verification mail.</div>
                        </c:when>
                        <c:when test="${not empty requestScope.login_error}">
                            <div style="color:darkred;"><c:out value="${requestScope.login_error}"/></div>
                        </c:when>
                    </c:choose>
                </div>
                <hr>
                <label for="email"><strong>Email</strong></label>
                <input type="email" placeholder="Email" name="email" id="email" required>

                <label for="password"><strong>Password</strong></label>
                <input type="password" id="password" name="password" placeholder="Password">


                <div class="clearfix">

                    <button type="submit" class="submitbtn">Submit</button>
                    <p>Don't have an account?</p>
                    <a href="Registration">
                        <button type="button" class="secondary_log_sign"
                            onclick="">Register</button>
                    </a>
                    <a href="reset?t=password&role=member">Forgot Password? Click to Reset.</a>
<%--                    go to registration.jsp onclick--%>
                </div>
            </div>
        </form>
    </div>

</div>

<%@include file="../includes/footer.jsp"%>
