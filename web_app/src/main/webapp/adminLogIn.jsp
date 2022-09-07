<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 08-Sep-22
  Time: 12:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="./includes/regLoginHead.jsp"%>
<div class="content">
    <div class="modal" id="id05">


        <form class="modal-content" action="admin-login" method="post">
            <div class="container">
                <h3>Log In</h3>
                <br>
                <div class="error_message">

                        <c:if test="${not empty requestScope.login_error}">
                            <div style="color:darkred;"><c:out value="${requestScope.login_error}"/></div>
                        </c:if>
                </div>
                <hr>
                <label for="email"><strong>Email</strong></label>
                <input type="email" placeholder="Email" name="email" id="email" required>

                <label for="password"><strong>Password</strong></label>
                <input type="password" id="password" name="password" placeholder="Password">


                <div class="clearfix">

                    <button type="submit" class="submitbtn">Submit</button>

                </div>
            </div>
        </form>
    </div>

</div>

<%@include file="./includes/footer.jsp"%>
