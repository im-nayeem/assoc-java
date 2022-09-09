<%-- 
    Document   : noticeDetails
    Created on : Sep 9, 2022, 1:28:39 PM
    Author     : Mestu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="includes/head.jsp"%>
<style>
    <%@include file="assets/notice.css"%>
    .notice-container{
        border: 1px solid black;
        width:70%;
        margin: 10px auto;
        padding: 30px;
        background: white;
    }
</style>
<div class="content" id="content">
    <div class="notice-container">
        <div id="headline">
            ${sessionScope.noticeDetails.getHeadline()}
        </div>
        <div id="details">
            ${sessionScope.noticeDetails.getDetails()}
        </div>
        <hr><p style="background: white; font-weight: 600; text-align: right; margin:30px 30px;">Noticed By</p>
        <div id="noticefooter">
            ${sessionScope.noticeDetails.getFooter()}
        </div>
    </div>
</div>
<%@ include file="includes/footer.jsp"%>