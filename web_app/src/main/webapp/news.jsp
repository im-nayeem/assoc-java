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
    <c:choose>
        <c:when test="${empty sessionScope.newsList}">
            <p class="paragraph">No Previous News</p>
        </c:when>
        <c:otherwise>
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
                        <td style="text-align: center;"><a target="_blank" href="DetailsNewsNotice?type=news&id=${sessionScope.newsList[i].getNewsId()}"> <button>See Details</button></a></td>

                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>

</div>
<%@ include file="includes/footer.jsp"%>
