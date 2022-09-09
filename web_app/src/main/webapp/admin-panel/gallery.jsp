<%-- 
    Document   : gallery
    Created on : Sep 10, 2022, 12:47:09 AM
    Author     : Mestu
--%>

<%@include file="../includes/adminHead.jsp"%>
<style>
    <%@include file="../assets/notice.css"%>
</style>
<div class="notice-container">
    <p class="paragraph"><a href="galleryForm.jsp">Add new event</a></p>
    <c:choose>
        <c:when test="${requestScope.description.size()<1}">
            <p class="paragraph">No Galleries</p>
        </c:when>
        <c:otherwise>
            <table>
                <tr>
                    <th style="width:8%;">Serial No</th>
                    <th style="width:62%;">Short description</th>
                    <th style="width:10%;">Details</th>
                    <th style="width:10%;">Update</th>
                    <th style="width:10%;">Delete</th>
                </tr>
                <c:forEach var="i" begin="0" end="${requestScope.description.size()-1}">
                    <tr>
                        <td>${i+1}</td>
                        <td>${requestScope.description[i]}</td>
                        <td style="text-align: center;"><a target="_blank" href="DetailsNewsNotice?type=gallery&id=${requestScope.id[i]}"> <button>See Details</button></a></td>
                    
                        <td style="text-align: center;">
                            <!--<a href="UpdateNotice?type=notice&id=${sessionScope.noticeList[i].getNoticeId()}">-->
                                <button>Update</button>
                            <!--</a>-->
                        </td>
                        <td style="text-align: center;">
                            <button onclick="confirmDelete(${i}, ${requestScope.description.size()})">Delete</button>
                            <a id="confirm${i}" style="display:none;" href="DeleteNewsNotice?type=gallery&id=${requestScope.id[i]}">
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
        const confirmId = document.getElementById("confirm"+id);
        if(confirmId.style.display === "block"){
            confirmId.style.display = "none";
            return;
        }
        for(var i=0; i<numberOfId; i++){
            var Id = document.getElementById("confirm"+i);
            Id.style.display = "none";
            console.log(id+" this "+Id);
        }
        confirmId.style.display = "block";
        console.log(id+" that "+confirmId);
    }
</script>
