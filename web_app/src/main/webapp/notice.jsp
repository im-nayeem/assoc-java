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
                <td>${sessionScope.noticeList[i].getPublicationDate()}</td>
                <td style="text-align: center;"><button type="button" id="${i}" onclick="seeDetails(this.id)" value="${sessionScope.noticeList[i].getDetails()}">See Details</button></td>
            <input type="hidden" id="headline${i}" value="${sessionScope.noticeList[i].getHeadline()}"/>
            <input type="hidden" id="footer${i}" value="${sessionScope.noticeList[i].getFooter()}"/>

            </tr>
        </c:forEach>
    </table>
    <div id="noticeDetailsModal" class="modal">
        <div class="modal-content">
            <span class="closeBtn" onclick="closeModel()">&times;</span>
            <div id="headline">
            </div>
            <div id="details">
            </div>
            <hr><p style="background: white; font-weight: 600; text-align: right; margin:30px 30px;">Noticed By</p>
            <div id="noticefooter">
            </div>
        </div>
    </div>
</div>
<script>
    function seeDetails(clicked_id) {
        const noticeDetails = document.getElementById(clicked_id);
        const noticeHeadline = document.getElementById("headline" + clicked_id);
        const noticeFooter = document.getElementById("footer" + clicked_id);
        
        
//        set details in modal
        const headline = document.getElementById("headline");
        headline.innerHTML = noticeHeadline.value;
        const details = document.getElementById("details");
        details.innerHTML = noticeDetails.value;
        const noticefooter = document.getElementById("noticefooter");
        noticefooter.innerHTML =  noticeFooter.value;
        
//        display details notice
        const modal = document.getElementById("noticeDetailsModal");
        modal.style.display = "block";
        return ;
    }
//    close modal
    function closeModel(){
        const modal = document.getElementById("noticeDetailsModal");
        modal.style.display = "none";
    }
</script>
<%@ include file="includes/footer.jsp"%>
