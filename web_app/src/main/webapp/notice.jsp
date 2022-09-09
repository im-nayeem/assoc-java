<%-- 
    Document   : notice
    Created on : Sep 8, 2022, 8:08:54 PM
    Author     : Mestu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="includes/head.jsp"%>

<style>
    <%@include file="assets/notice.css"%>
</style>
<div class="notice-container">

    <table>
        <tr>
            <th style="width:8%;">Serial No</th>
            <th style="width:70%;">Headline</th>
            <th style="width:13%;">Publication Date</th>
            <th style="width:10%;">Details</th>
        </tr>
        <c:forEach var="i" begin="0" end="${sessionScope.noticeList.size()-1}">
            <tr>
                <td>${i+1}</td>
                <td>${sessionScope.noticeList[i].getHeadline()}</td>
                <td>${sessionScope.noticeList[i].getPublicationDate()} ${sessionScope.noticeList[i].getNoticeId()}</td>
                <td style="text-align: center;"><a target="_blank" href="DetailsNewsNotice?type=notice&id=${sessionScope.noticeList[i].getNoticeId()}"> <button>See Details</button></a></td>

            </tr>
        </c:forEach>
    </table>
</div>
<%@ include file="includes/footer.jsp"%>
