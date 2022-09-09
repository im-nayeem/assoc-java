<%-- 
    Document   : addNews
    Created on : Sep 9, 2022, 2:41:42 PM
    Author     : Mestu
--%>

<%@include file="includes/adminHead.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    .container{
        border: 1px solid black;
        width: 80%;
        min-height: 50vh;
        margin: 45px auto;
        padding: 25px;
        background: white;
    }
    .container form{
        background: white;
    }
    .container input,textarea{
        width: 80%;
        margin: 20px 10%;
        height: 30px;
        padding: 10px;
        background: white;
    }
    .container button{
        width: 10%;
        margin: 10px 45%;
        padding: 5px 20px;
        background: #d9d9d9;
        font-weight: 700;
        font-size: 20px;
        text-align: center;
    }
    .container h2{
        text-align: center;
        background: white;
    }
    .container label{
        margin-left: 10%;
        background: white;
    }
    .container .details-input{
        height: 100px;
        background: white;
    }
</style>
<div class="content">
    <div class="container">
        <h2>Add new news</h2><br><hr><br>
        <form action="AddNews" method="post" enctype='multipart/form-data'>
            
            <!----------------------------new news---------------------->
            
            <c:if test="${empty sessionScope.updateNews}">
                <input name="newNews" value="yes" type="hidden"/>

                <label for="headline">Enter headline of notice</label>
                <input required class="headline-input" name="headline" type="text" value="" placeholder="Enter headline"/>
                <label for="photo">Add a photo </label>
                <input type="file" name="photo"/>
                <label for="details">Enter details of notice</label>
                <textarea required class="details-input" name="details" value=""></textarea>
                <label for="footer">Enter author name of notice</label>
                <input required class="footer-input" name="footer" type="text" value="" placeholder="Enter author name"/>
            </c:if>
                
            <!----------------------for update news------------------->
            
            <c:if test="${not empty sessionScope.updateNews}">
                <input name="newNews" value="no" type="hidden"/>

                <label for="headline">Enter headline of notice</label>
                <input required class="headline-input" name="headline" type="text" value="${sessionScope.updateNews.getHeadline()}" placeholder="Enter headline"/>
                <label style="font-weight: bold; font-size: 20px;">To change image you have to delete this news and add as new news </label>
                <br><br><br>
                <label for="details">Enter details of notice</label>
                <textarea required class="details-input" name="details">${sessionScope.updateNews.getDetails()}</textarea>
                <label for="footer">Enter author name of notice</label>
                <input required class="footer-input" name="footer" type="text" value="${sessionScope.updateNews.getFooter()}" placeholder="Enter author name"/>
            </c:if>
                
            <button type="submit">Add</button>
        </form>
    </div>
</div>
</body>
</html>