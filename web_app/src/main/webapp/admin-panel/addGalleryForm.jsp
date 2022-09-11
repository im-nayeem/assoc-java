<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 10-Sep-22
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../includes/regLoginHead.jsp"%>
<div class="content">
    <div class="modal" id="id10">

        <a href="manage-gallery?t=all"><span onclick="" class="close" title="Close Form">&times;</span></a>
        <%--            onclick go to home page--%>

        <form class="modal-content" action="manage-gallery" method="post" enctype="multipart/form-data" accept-charset="utf-8">
            <div class="container">
                <h3>Add New Gallery</h3>
                <br>
                <hr>
                <label for="desc"><strong>Short Description</strong></label>
                <input type="text" placeholder="" name="desc" id="desc"  required>

                <label for="photo1"><strong>Select Your Photo-1</strong>(less than 16MB):</label>
                <input type="file" id="photo1" name="photo1" required><br>
                <label for="caption1"><strong>Caption-1</strong></label>
                <input type="text" name="caption1" id="caption1"  required>

                <label for="photo2"><strong>Select Your Photo-2</strong>(less than 16MB):</label>
                <input type="file" id="photo2" name="photo2"><br>
                <label for="caption2"><strong>Caption-2</strong></label>
                <input type="text" name="caption2" id="caption2" >

                <label for="photo3"><strong>Select Your Photo-3</strong>(less than 16MB):</label>
                <input type="file" id="photo3" name="photo3"><br>
                <label for="caption3"><strong>Caption-3</strong></label>
                <input type="text" name="caption3" id="caption3">

                <label for="video_link"><strong>Video Link</strong></label>
                <input type="text" name="video_link" id="video_link">


                <div class="clearfix">

                    <button type="submit" class="submitbtn">Submit</button>
                </div>
            </div>
        </form>
    </div>

</div>


</body>
</html>
