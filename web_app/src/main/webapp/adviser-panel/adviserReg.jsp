<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 09-Sep-22
  Time: 11:36 PM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="../includes/regLoginHead.jsp"%>
<div class="content">
    <div class="modal" id="id07">

        <form class="modal-content" action="adviser-reg" method="post" enctype='multipart/form-data'>
            <div class="container">
                <h3>Adviser Info</h3>
                <br>
                <div class="error_message">
                    <c:if test="${not empty requestScope.login_error}">
                        <div style="color:darkred;"><c:out value="${requestScope.login_error}"/></div>
                    </c:if>
                </div>
                <hr>
                <input type="hidden" value="${requestScope.adviserMail}" name="email" id="email">

                <label for="password"><strong>Password</strong></label>
                <input type="password" id="password" name="password" placeholder="Password" required>

                <div id="warn_mismatched_pass">

                </div>

                <label for="confirm_pass"><strong>Confirm Password</strong></label>
                <input type="password" id="confirm_pass" placeholder="Confirm Password" name="confirm_pass" onkeyup="checkPass();" required>

                <label for="occupation"><strong>Occupation</strong></label>
                <input type="text" placeholder="Current Occupation" name="occupation"
                       id="occupation" pattern="[A-Za-z ]+" required>
                <label for="present_addr"><strong>Present Address</strong></label>
                <input type="text" placeholder="Current Living Address" name="present_addr" id="present_addr"
                       pattern="[A-Za-z ,#]+" required>
                <label for="permanent_addr"><strong>Permanent Address</strong></label>
                <input type="text" placeholder="Permanenent Address" name="permanent_addr"
                       id="permanent_addr" pattern="[A-Za-z ,#]+" required>

                <label for="photo"><strong>Select Your Photo</strong>(less than 16MB):</label>
                <input type="file" id="photo" name="photo" required><br>

                <div class="clearfix">
                    <button type="submit" class="submitbtn">Submit</button>
                </div>
            </div>
        </form>
    </div>

</div>

<%@include file="../includes/footer.jsp"%>
