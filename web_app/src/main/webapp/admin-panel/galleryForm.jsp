<%-- 
    Document   : galleryForm
    Created on : Sep 10, 2022, 12:33:41 AM
    Author     : Mestu
--%>

<%@include file="../includes/adminHead.jsp"%>
<style>
    <%@include file="../assets/form.css"%>
    label{
        background: transparent;
    }
</style>
<div class="content">

    <div class="gallery-input">
        <h2 style="background: white;" >Add New Event to Gallery</h2><hr><br>
        <form style="background: white;" action="manage-gallery" method="post" enctype="multipart/form-data">
            <label style="margin-left: -45%; font-size:20px;" for="description">Add short description of event:</label><br>
            <br>
            <textarea rows="10" cols="50" required name="description" id="description"></textarea><br><br><br>

            <button type="button" style="margin-left: 30px;" id="addMore">Add more image</button>
            <div id="allImg" class="all-img">

                <li>
                    <input name="img1" type="file" required>
                </li>
                <li>
                    <input name="caption1" type="text" required placeholder="Add your photo's caption">
                </li>

            </div>

            <button style="padding:5px 10px;" type="submit">Add</button>
        </form>
    </div>
</div>
<script>
    const addMoreImg = document.getElementById("addMore");
    addMoreImg.addEventListener('click', addImage);
    function addImage() {
        var countChild = document.getElementById("allImg").childElementCount;
        console.log(countChild);
        var id = Math.floor(countChild / 2) + 1;
        if (id > 3) {
            alert("max image 3");
            return;
        }
        var input1 = document.createElement("input");
        input1.name = "img" + id;
        input1.type = "file";
        input1.required = true;
        var input2 = document.createElement("input");
        input2.name = "caption" + id;
        input2.type = "text";
        input2.required = true;
        input2.placeholder = "Add your photo's caption"

        var list1 = document.createElement("li");
        var list2 = document.createElement("li");
        list1.appendChild(input1);
        list2.appendChild(input2);

        document.getElementById("allImg").appendChild(list1);
        document.getElementById("allImg").appendChild(list2);
    }

</script>
</body>
</html>
