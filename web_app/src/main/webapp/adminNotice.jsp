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
            <p class="paragraph">No previous notice</p>
        </c:when>
        <c:otherwise>
            <table>
                <tr>
                    <th style="width:8%;">Serial No</th>
                    <th style="width:50%;">Headline</th>
                    <th style="width:12%;">Publication Date</th>
                    <th style="width:10%;">Details</th>
                    <th style="width:10%;">Update</th>
                    <th style="width:10%;">Delete</th>
                </tr>
                <c:forEach var="i" begin="0" end="${sessionScope.noticeList.size()-1}">
                    <tr>
                        <td>${i+1}</td>
                        <td>${sessionScope.noticeList[i].getHeadline()}</td>
                        <td>${sessionScope.noticeList[i].getPublicationDate()}</td>
                        <td style="text-align: center;"><a target="_blank" href="DetailsNewsNotice?type=notice&id=${sessionScope.noticeList[i].getNoticeId()}"> <button>See Details</button></a></td>
                    
                        <td style="text-align: center;"><a href="UpdateNotice?type=notice&id=${sessionScope.noticeList[i].getNoticeId()}"><button>Update</button></a></td>
                        <td style="text-align: center;">
                            <button onclick="confirmDelete(${i}, ${sessionScope.noticeList.size()})">Delete</button>
                            <a id="confirm${i}" style="display:none;" href="DeleteNewsNotice?type=notice&id=${sessionScope.noticeList[i].getNoticeId()}">
                                <button style="color:red">Confirm Delete</button>
                            </a>
                        </td>

                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>

</div>
<script>
    function confirmDelete(id, numberOfId){
        for(var i=0; i<numberOfId; i++){
            var Id = document.getElementById("confirm"+i);
            Id.style.display = "none";
            console.log(id+" this "+Id);
        }
        const confirmId = document.getElementById("confirm"+id);
        confirmId.style.display = "block";
        console.log(id+" that "+confirmId);
    }
</script>
