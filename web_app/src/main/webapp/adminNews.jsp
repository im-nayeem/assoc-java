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
<div class="content"> 
    <div class="notice-container">
        <p class="paragraph"><a href="addNews.jsp">Add new News</a></p>
        <c:choose>
            <c:when test="${sessionScope.newsList.size()<1}">
                <p class="paragraph">No previous News</p>
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
                    <c:forEach var="i" begin="0" end="${sessionScope.newsList.size()-1}">
                        <tr>
                            <td>${i+1}</td>
                            <td>${sessionScope.newsList[i].getHeadline()}</td>
                            <td>${sessionScope.newsList[i].getPublicationDate()}</td>
                            <td style="text-align: center;"><a target="_blank" href="DetailsNewsNotice?type=news&id=${sessionScope.newsList[i].getNewsId()}"> <button>See Details</button></a></td>
                            
                            <td style="text-align: center;"><a href="UpdateNotice?type=news&id=${sessionScope.newsList[i].getNewsId()}"><button>Update</button></a></td>
                            
                            <td style="text-align: center;">
                                <button onclick="confirmDelete(${i}, ${sessionScope.newsList.size()})">Delete</button>
                                <a id="confirm${i}" style="display:none;" href="DeleteNewsNotice?type=news&id=${sessionScope.newsList[i].getNewsId()}">
                                    <button style="color:red">Confirm Delete</button>
                                </a>
                            </td>

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
</div>
<script>
    function confirmDelete(id, numberOfId) {
        const confirmId = document.getElementById("confirm" + id);
        if(confirmId.style.display === "block"){
            confirmId.style.display = "none";
            return;
        }
        for (var i = 0; i < numberOfId; i++) {
            var Id = document.getElementById("confirm" + i);
            Id.style.display = "none";
            console.log(id + " this " + Id);
        }
        confirmId.style.display = "block";
        console.log(id + " that " + confirmId);
    }
</script>

