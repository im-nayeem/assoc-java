<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 25-Aug-22
  Time: 1:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/regLoginHead.jsp"%>
<head>
    <title>Association Information</title>
</head>
<div class="content">
    <div id="id01" class="modal">
        <a href="../"> <span class="close" onclick="" title="Close Form">&times;</span></a>
        <%--        //onclick go to home page--%>

        <form class="modal-content" action="StoreInfo" method="post" enctype='multipart/form-data'>

            <!--this hidden type input help to StoreInfo servlet-->
            <input type="hidden" name="infoType" value="assocInfo"/>


            <!----------container that contain form input fields--------->
            <div class="container">

                <h3>Association Information</h3>
                <br>
                <hr>
                <fieldset>
                    <legend>Basic information</legend>
                    <label for="assoc_name"><strong>Association Name</strong></label>
                    <input type="text" placeholder="Association name" name="assoc_name" id="assoc_name" pattern="[A-Za-z ]+" required>

                    <label for="assoc_email"><strong>Association Email</strong></label>
                    <input type="text" placeholder="Association email" name="assoc_email" id="assoc_email" required/>

                    <label for="password"><strong>Association Password</strong></label>
                    <input type="password" placeholder="Association password" name="password" id="password" required>

                    <label for="confirm_pass"><strong>Confirm Password</strong></label>
                    <input type="password" placeholder="Confirm password" name="confirm_pass" id="confirm_pass" required>

                    <label for="assoc_logo"><strong>Select Association Logo</strong>(less than 16MB):</label>
                    <input type="file" name="assoc_logo" required><br><br>

                    <label for="assoc_constitution"><strong>Select Association Constitution (pdf)</strong></label>
                    <input type="file" name="assoc_constitution" id="assoc_constitution" required><br><br>

                    <label for="president_number"><strong>President's phone number</strong></label>
                    <input type="text" placeholder="President's phone number" name="president_number" id="president_number" required>

                    <label for="gen_sec_number"><strong>General Secretary Phone Number</strong></label>
                    <input type="text" placeholder="General secretary phone number" name="gen_sec_number" id="gen_sec_number" required>

                    <label for="assoc_about"><strong>About Association</strong></label>
                    <textarea name="assoc_about" row="4" col="50">
                    </textarea>
                    <div id="warn_mismatched_pass">

                    </div>
                </fieldset>
                <fieldset>
                    <legend>Payment method</legend>
                    <label for="payment_details"><strong>Payment details</strong></label>
                    <input type="text" placeholder="E.g. 180tk by bKash to 01700000000" name="payment_details" required>
                </fieldset>
                <br>


                <!---------- cancel and submit button for form --------------->
                <div class="clearfix">

                    <button type="submit" class="submitbtn">Submit</button>
                    <p>Already have an account?</p>
                    <a href="Login">
                        <button type="button" class="secondary_log_sign"
                                onclick="">Login</button>
                    </a>
                    <%--                    go to login.jsp onclick--%>


                </div>

            </div>

            <!-- End of container div -->
        </form>
    </div>
</div>
<%@include file="../includes/footer.jsp"%>
