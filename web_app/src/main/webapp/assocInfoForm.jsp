<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 07-Sep-22
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="./includes/regLoginHead.jsp"%>
<div class="content">
    <div id="id06" class="modal">
        <a href="./"> <span class="close" onclick="" title="Close Form">&times;</span></a>
        <form class="modal-content" action="StoreInfo" method="post" enctype='multipart/form-data' >
            
            <!--this hidden type input help to StoreInfo servlet-->
            <input type="hidden" name="infoType" value="assocInfo"/>
            
            <div class="container">

                <h3>Association Information</h3>
                <br>
                <hr>
                <fieldset>
                    <legend>Basic information</legend>
                    <label for="assoc_name"><strong>Association Name</strong></label>
                    <input type="text" placeholder="Association name" name="assoc_name" id="assoc_name" pattern="[A-Za-z ']+" required>

                    <label for="assoc_abbr"><strong>Association Name Abbreviation</strong></label>
                    <input type="text" placeholder="Abbreviation-Institution Name e.g, MSWA-CoU" name="assoc_abbr" id="assoc_abbr" pattern="[A-Za-z -]+" required>

                    <label for="assoc_email"><strong>Association Email</strong></label>
                    <input type="text" placeholder="Association email" name="assoc_email" id="assoc_email" required/>

                    <label for="password"><strong>Association Email in-app Password</strong></label>
                    <input type="password" placeholder="Association password" name="password" id="password" required>

                    <div id="warn_mismatched_pass">

                    </div>
                    <label for="confirm_pass"><strong>Confirm Password</strong></label>
                    <input type="password" placeholder="Confirm password" name="confirm_pass" id="confirm_pass" onkeyup="checkPass();" required>

                    <label for="assoc_logo"><strong>Select Association Logo</strong>(less than 16MB):</label>
                    <input type="file" name="assoc_logo" id="assoc_logo" required><br><br>

                    <label for="assoc_constitution"><strong>Select Association Constitution (pdf)</strong></label>
                    <input type="file" name="assoc_constitution" id="assoc_constitution" required><br><br>

                    <label for="president_number"><strong>President's phone number</strong></label>
                    <input type="text" placeholder="President's phone number" name="president_number" id="president_number" required>

                    <label for="gen_sec_number"><strong>General Secretary's Phone Number</strong></label>
                    <input type="text" placeholder="General secretary phone number" name="gen_sec_number" id="gen_sec_number" required>

                    <label for="assoc_about"><strong>About Association</strong></label>
                    <textarea name="assoc_about" id="assoc_about" placeholder="Description about Association,Starting,Aim and Future"></textarea>

                </fieldset>
                <fieldset>
                    <legend>Payment method</legend>
                    <label for="payment_details"><strong>Payment details</strong></label>
                    <input type="text" placeholder="E.g. Send Money 100TK by BKASH/NAGAD/ROCKET and provide your transaction number." name="payment_details" id="payment_details" required>
                </fieldset>
                <br>


                <!---------- cancel and submit button for form --------------->
                <div class="clearfix">

                    <button type="submit" class="submitbtn">Submit</button>


                </div>

            </div>
            
        </form>

    </div>
</div>

<%@include file="./includes/footer.jsp"%>