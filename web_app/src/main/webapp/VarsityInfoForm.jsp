<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 07-Sep-22
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="../includes/regLoginHead.jsp"%>
<div class="content">
    <div id="id01" class="modal">
        <a href="../"> <span class="close" onclick="" title="Close Form">&times;</span></a>
        <form class="modal-content" action="StoreInfo" method="post" >
            <!--this hidden type input help to StoreInfo servlet-->
            <input type="hidden" name="infoType" value="varsityInfo" />

            <!----------container that contain form input fields--------->
            <div class="container">

                <h3>Varsity Information</h3>
                <br>
                <hr>
                <fieldset style="padding: 10px 5px;">
                    <legend>Basic information</legend>
                    <label for="varsity_name"><strong>Varsity Name</strong></label>
                    <input type="text" placeholder="Varsity name" name="varsity_name" pattern="[A-Za-z ]+" required>

                    <label for="varsity_web_link"><strong>Varsity Website Link</strong></label>
                    <input type="text" placeholder="Varsity website link" name="varsity_web_link" required>

                    <label for="last_batch_number"><strong>Varsity Website Link</strong></label>
                    <input type="number" placeholder="Last batch number" name="last_batch_number" required>

                    <label for="number_of_dept"><strong>Number Of departments</strong></label>
                    <div style="display:flex;">
                        <input type="text" id="number_of_dept" name="number_of_dept" placeholder="Number of departments" style="width:80%;"/>
                        <div style="margin:18px; text-align: center;"><a href="#" style="text-decoration:none; background:#316955; color:white; padding: 10px 10px;" onclick="addFields()">Apply</a></div>
                    </div>
                    <div id="container"/>

                    <div id="warn_mismatched_pass">

                    </div>
                </fieldset>

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
        </form>

    </div>
</div>

<script type='text/javascript'>
    function addFields() {
        // Generate a dynamic number of inputs
        var number = document.getElementById("number_of_dept").value;
        // Get the element where the inputs will be added to
        var container = document.getElementById("container");
        // Remove every children it had before
        while (container.hasChildNodes()) {
            container.removeChild(container.lastChild);
        }
        for (i = 0; i < number; i++) {
            // Append a node with a random text
            // container.appendChild(document.createTextNode("Department Name " + (i+1)));
            // Create an <input> element, set its type and name attributes
            var input = document.createElement("input");
            input.type = "text";
            input.name = "department" + (i + 1);
            input.placeholder = "Department name " + (i + 1);
            container.appendChild(input);
            // Append a line break 
            container.appendChild(document.createElement("br"));
        }
    }
</script>
<%@include file="../includes/footer.jsp"%>