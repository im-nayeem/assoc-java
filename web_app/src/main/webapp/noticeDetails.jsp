<%-- 
    Document   : noticeDetails
    Created on : Sep 9, 2022, 1:28:39 PM
    Author     : Mestu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="includes/head.jsp"%>
<style>
    <%@include file="assets/notice.css"%>


</style>
<div class="content" id="content">
    <div class="notice-container">
        <div id="headline">
            ${sessionScope.noticeDetails.getHeadline()}
        </div>
        <div id="details" class="details">
            ${sessionScope.noticeDetails.getDetails()}
        </div>
        <div class="footer">
        ${sessionScope.noticeDetails.getFooter()}
        </div>
    </div>
</div>
<%@ include file="includes/footer.jsp"%>