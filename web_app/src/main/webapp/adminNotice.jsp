<%-- 
    Document   : adminNotice
    Created on : Sep 9, 2022, 2:51:04 AM
    Author     : Mestu
--%>

<%@include file="includes/adminHead.jsp"%>
<style>
    <%@include file="assets/notice.css"%>
    p{
        background:white;
        width: max-content;
        height: max-content;
        padding:10px;
        font-weight: 600;
        margin:20px auto;
    }
    p a{
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
    <p><a href="addNotice.jsp">Add new Notice</a></p>
    <c:choose>
        <c:when test="${sessionScope.noticeList.size()<1}">
            <p>No previous notice</p>
        </c:when>
        <c:otherwise>
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
                        <td style="text-align: center;"><a href="UpdateNotice">Update</a></td>

                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>

</div>
