<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 25-Aug-22
  Time: 1:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="includes/regLoginHead.jsp"%>
<div class="content">
    <div id="id01" class="modal">
        <a href="./"> <span class="close" onclick="" title="Close Form">&times;</span></a>
<%--        //onclick go to home page--%>

        <form class="modal-content" action="/Registration" method="post">

            <!----------container that contain form input fields--------->
            <div class="container">

                <h3>Register</h3>
                <br>
                <div class="error_message">

                </div>
                <hr>
                <fieldset>
                    <legend>Personal Info</legend>
                    <label for="name"><strong>Name</strong></label>
                    <input type="text" placeholder="Name" name="name" id="name" pattern="[A-Za-z ]+" required>

                    <label for="email"><strong>Email</strong></label>
                    <input type="email" placeholder="Email" name="email" id="email" required>

                    <label for="password"><strong>Password</strong></label>
                    <input type="password" id="password" name="password" placeholder="Password">

                    <div id="warn_mismatched_pass">

                    </div>

                    <label for="confirm_pass"><strong>Confirm Password</strong></label>
                    <input type="password" id="confirm_pass" placeholder="Confirm Password"name="confirm_pass" onkeyup="checkPass();">


                    <label for="dept"><strong>Department</strong></label>
                    <select name="department" id="dept" required>
                        <option selected disabled hidden>Select Department</option>
                        // use jstl to set all the dept name
                        <option value=""></option>
                        //use jstl
                    </select>

                    <label for="id"><strong>ID</strong></label>
                    <input type="number" placeholder="ID" name="id" id="id" required>


                    <label for="session"><strong>Session</strong></label>
                    <input type="text" placeholder="Session(format: 2018-2019)" name="session" id="session"
                           pattern="[0-9]{4}-[0-9]{4}" title="For example: 2018-2019" required>

                    <label for="batch"><strong>Batch</strong></label>
                    <input type="number" placeholder="Batch" name="batch" id="batch" required>

                    <label for="male"><strong>Gender:</strong></label>
                    <label>
                        <input type="radio" name="gender" value="Male" id="male" required>Male</label>
                    <label>
                        <input type="radio" name="gender" value="Female" id="female" required>Female</label>
                    <label>
                        <input type="radio" name="gender" value="others" id="others" required>Others</label>
                    <br><br>

                    <label for="blood_group"><strong>Blood Group</strong></label>
                    <select name="blood_group" id="blood_group" required>
                        <option selected disabled hidden>Select Blood Group</option>
                        // use jstl to set all the dept name
                        <option value=""></option>
                        //use jstl
                    </select>

                    <label for="photo"><strong>Select Your Photo</strong>(less than 16MB):</label>
                    <input type="file" id="photo" name="photo" required><br><br>
                    <label for="co_actvt"><strong>Co-curricular Activities</strong></label>
                    <input type="text" placeholder="Co-curricular Activities you are good at" name="co_actvt"
                           id="co_actvt" pattern="[A-Za-z,]+" required>
                </fieldset>
                <br>
                <fieldset>
                    <legend>Family Info</legend>
                    <label for="fathers_name"><strong>Father's Name</strong></label>
                    <input type="text" placeholder="Father's Name" name="fathers_name" id="fathers_name"
                           pattern="[A-Za-z ]+" required>
                    <label for="mothers_name"><strong>Mother's Name</strong></label>
                    <input type="text" placeholder="Mother's Name" name="present_details" id="mothers_name"
                           pattern="[A-Za-z ]+" required>
                </fieldset>

                <br>
                <!-- <br> -->
                <fieldset>
                    <legend>Present Address</legend>
                    <label for="present_area"><strong>Area</strong></label>
                    <input type="text" placeholder="Current Living Area" name="present_area" id="present_area"
                           pattern="[A-Za-z ]+" required>
                    <label for="present_details"><strong>Details</strong></label>
                    <input type="text" placeholder="Street/Road" name="present_details" id="present_details"
                           pattern="[A-Za-z ]+" required>
                </fieldset>

                <br>
                <fieldset>
                    <legend>Permanent Address</legend>
                    <label for="upazila"><strong>Upazila</strong></label>
                    <input type="text" placeholder="Permanent Upazila" name="upazila" id="upazila"
                           pattern="[A-Za-z ]+" required>
                    <label for="permanent_details"><strong>Details</strong></label>
                    <input type="text" placeholder="Union-Street/Road" name="permanent_details"
                           id="permanent_details" pattern="[A-Za-z ]+" required>
                </fieldset>
                <br>
                <fieldset>
                    <legend>Payment Info</legend>
                    <strong>After sending *** TK to 01xxxxxxxx using Bkash/Rocket/Nagad payment
                        method collect your transaction number and provide it here.</strong>
                    <input type="text" name="transc_no" id="transc_no"
                           placeholder="Transaction Number/Sender Number">
                </fieldset>


                <!---------- cancel and submit button for form --------------->
                <div class="clearfix">

                    <button type="submit" class="submitbtn">Submit</button>
                    <p>Already have an account?</p>
                    <a href="login.jsp">
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
<%@include file="includes/footer.jsp"%>
