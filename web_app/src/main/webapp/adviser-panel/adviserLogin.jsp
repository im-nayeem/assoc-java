<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 09-Sep-22
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../includes/regLoginHead.jsp"%>
<div class="content">
  <div class="modal" id="id08">

    <a href="./"><span onclick="" class="close" title="Close Form">&times;</span></a>
    <%--            onclick go to home page--%>

    <form class="modal-content" action="adviser-panel" method="post">
      <div class="container">
        <h3>Adviser Log In</h3>
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
          <a href="reset?t=password&role=adviser">Forgot Password? Click to Reset.</a>
          <%--                    go to registration.jsp onclick--%>
        </div>
      </div>
    </form>
  </div>

</div>

<%@include file="../includes/footer.jsp"%>
