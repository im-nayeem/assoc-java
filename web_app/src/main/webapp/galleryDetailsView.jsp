<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 10-Sep-22
  Time: 9:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="includes/head.jsp"%>
<style>
    <%@include file="assets/homepage.css"%>
</style>
<div class="content homepage" id="content">

    <div class="slideshow">
        <c:if test="${not empty requestScope.gallery.getShortDesc()}">
            <c:if test="${not empty requestScope.gallery.getPhoto1()}">
                <img src="data:image/jpg;base64,${requestScope.gallery.getPhoto1()}" alt="photo1" class="slide">
                <p class="caption">${requestScope.gallery.getCaption1()}</p>
            </c:if>
            <c:if test="${not empty requestScope.gallery.getPhoto2()}">
                <img src="data:image/jpg;base64,${requestScope.gallery.getPhoto2()}" alt="photo2" class="slide">
                <p class="caption">${requestScope.gallery.getCaption2()}</p>
            </c:if>
            <c:if test="${not empty requestScope.gallery.getPhoto3()}">
                <img src="data:image/jpg;base64,${requestScope.gallery.getPhoto3()}" alt="photo3" class="slide">
                <p class="caption">${requestScope.gallery.getCaption3()}</p>
            </c:if>
        </c:if>
    </div>

    <div class="desc">
        <h3>${requestScope.gallery.getShortDesc()}</h3>
    </div>

</div>

<%@ include file="includes/footer.jsp"%>