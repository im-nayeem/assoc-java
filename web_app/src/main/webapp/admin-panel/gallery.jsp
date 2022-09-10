<%-- 
    Document   : gallery
    Created on : Sep 10, 2022, 12:47:09 AM
    Author     : Mestu
--%>

<%@include file="../includes/adminHead.jsp"%>
<style>
    <%@include file="../assets/gallery.css"%>
</style>
<div class="content">
            <div class="gallery-list">
                <c:forEach var="i" begin="0" end="${requestScope.galleryList.size()-1}">
                    <div class="single-gallery">
                        <img src="data:image/jpg;base64,${requestScope.galleryList.get(i).getPhoto1()}" alt="photo1">
                        <a href=""> <h4>${requestScope.galleryList.get(i).getShortDesc()}</h4></a>
                    </div>
                </c:forEach>
            </div>
</div>
</body>
</html>
