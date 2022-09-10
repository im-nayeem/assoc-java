<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 10-Sep-22
  Time: 9:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../includes/adminHead.jsp"%>
<style>
    <%@include file="../assets/gallery.css"%>
</style>
<div class="content">
    <a href="manage-gallery?t=add"><button>Add New Event to Gallery</button></a>
        <div class="gallery-list">
        <c:forEach var="i" begin="0" end="${requestScope.galleryList.size()-1}">
            <div class="single-gallery">
                <img src="data:image/jpg;base64,${requestScope.galleryList.get(i).getPhoto1()}" alt="photo1">
                <a href="gallery?t=details&id=${requestScope.galleryList.get(i).getId()}"> <h4>${requestScope.galleryList.get(i).getShortDesc()}</h4></a>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>

