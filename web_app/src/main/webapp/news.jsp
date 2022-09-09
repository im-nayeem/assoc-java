<%-- 
    Document   : news
    Created on : Sep 8, 2022, 9:55:27 PM
    Author     : Mestu
--%>


<%@include file="includes/head.jsp"%>

<style>
    <%@include file="assets/notice.css"%>
</style>
<div class="notice-container">

    <table>
        <tr>
            <th style="width:8%;">Serial No</th>
            <th style="width:70%;">Headline</th>
            <th style="width:12%;">Publication Date</th>
            <th style="width:10%;">Details</th>
        </tr>
        <c:forEach var="i" begin="0" end="${sessionScope.newsList.size()-1}">
            <tr>
                <td>${i+1}</td>
                <td>${sessionScope.newsList[i].getHeadline()}</td>
                <td>${sessionScope.newsList[i].getPublicationDate()}</td>
                <td style="text-align: center;"><button type="button" id="${i}" onclick="seeDetails(this.id)" value="${sessionScope.newsList[i].getDetails()}">See Details</button></td>
            <input type="hidden" id="headline${i}" value="${sessionScope.newsList[i].getHeadline()}"/>
            <input type="hidden" id="footer${i}" value="${sessionScope.newsList[i].getFooter()}"/>
            <input type="hidden" id="newsPhoto${i}" value=""/>

            </tr>
        </c:forEach>
    </table>
    <div id="noticeDetailsModal" class="modal">
        <div class="modal-content">
            <span class="closeBtn" onclick="closeModel()">&times;</span>
            <div id="headline">
            </div>
            <div id="newsPhoto">
                
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
        const newsPhoto = document.getElementById("newsPhoto"+clicked_id);
        
        
//        set details in modal
        const headline = document.getElementById("headline");
        headline.innerHTML = noticeHeadline.value;
        const details = document.getElementById("details");
        details.innerHTML = noticeDetails.value;
        const noticefooter = document.getElementById("noticefooter");
        noticefooter.innerHTML =  noticeFooter.value;
        const newsphoto = document.getElementById("newsPhoto");
        newsphoto.innerHTML = "<img height=\"400\" width=\"400\" src=\"data:image/jpg;base64,"+newsPhoto.value+"alt=\"Member Picture\"/>";
        
        
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
