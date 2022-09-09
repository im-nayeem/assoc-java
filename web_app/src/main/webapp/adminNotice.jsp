<%-- 
    Document   : adminNotice
    Created on : Sep 9, 2022, 2:51:04 AM
    Author     : Mestu
--%>

<%@include file="includes/adminHead.jsp"%>
<style>
    <%@include file="assets/notice.css"%>
    .paragraph{
        background:white;
        width: max-content;
        height: max-content;
        padding:10px;
        font-weight: 600;
        margin:20px auto;
    }
    .paragraph a{
        background:#1c9356;
        padding:10px;
        margin: -9px;
        font-weight: 600;
        color:white;
        border:none;
        text-decoration: none;
    }
    table td a{
        background: #f1f1f1;
        padding: 3px;
        color: black;
        text-decoration: none;
    }
</style>
<div class="notice-container">
    <p class="paragraph"><a href="addNotice.jsp">Add new Notice</a></p>
    <c:choose>
        <c:when test="${sessionScope.noticeList.size()<1}">
            <p>No previous notice</p>
        </c:when>
        <c:otherwise>
            <table>
                <tr>
                    <th style="width:8%;">Serial No</th>
                    <th style="width:60%;">Headline</th>
                    <th style="width:12%;">Publication Date</th>
                    <th style="width:10%;">Details</th>
                    <th style="width:10%;">Update</th>
                </tr>
                <c:forEach var="i" begin="0" end="${sessionScope.noticeList.size()-1}">
                    <tr>
                        <td>${i+1}</td>
                        <td>${sessionScope.noticeList[i].getHeadline()}</td>
                        <td>${sessionScope.noticeList[i].getPublicationDate()}</td>
                        <td style="text-align: center;"><button type="button" id="${i}" onclick="seeDetails(this.id)" value="${sessionScope.noticeList[i].getDetails()}">See Details</button></td>
                    <input type="hidden" id="headline${i}" value="${sessionScope.noticeList[i].getHeadline()}"/>
                    <input type="hidden" id="footer${i}" value="${sessionScope.noticeList[i].getFooter()}"/>
                    <td style="text-align: center;"><a href="UpdateNotice?noticeId=${sessionScope.noticeList[i].getNoticeId()}"><button>Update</button></a></td>

                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>
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
        noticefooter.innerHTML = noticeFooter.value;

//        display details notice
        const modal = document.getElementById("noticeDetailsModal");
        modal.style.display = "block";
        return;
    }
//    close modal
    function closeModel() {
        const modal = document.getElementById("noticeDetailsModal");
        modal.style.display = "none";
    }
</script>
