<%-- 
    Document   : gallery
    Created on : Sep 10, 2022, 3:32:29 AM
    Author     : Mestu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="includes/head.jsp"%>
<style>
    div.gallery {
        border: 1px solid #777;
        border-radius: 0px 0px 10px 10px;
        background: #9bcfca;
        box-shadow: 0px 4px 8px 0px #383737;
    }

    div.gallery:hover {
        border: 1px solid #000;
    }

    div.gallery img {
        width: 100%;
        height: auto;
    }

    div.desc {
        padding: 15px;
        text-align: center;
    }

    * {
        box-sizing: border-box;
    }

    .responsive {
        padding: 0 6px;
        float: left;
        width: 24.99999%;
    }

    @media only screen and (max-width: 700px) {
        .responsive {
            width: 49.99999%;
            margin: 6px 0;
        }
    }

    @media only screen and (max-width: 500px) {
        .responsive {
            width: 100%;
        }
    }

    .clearfix:after {
        content: "";
        display: table;
        clear: both;
    }

    /*----------manual-------------*/
    .paragraph{
        background:white;
        width: max-content;
        height: max-content;
        padding:10px;
        font-weight: 600;
        margin:20px auto;
    }
</style>
<div class="content" id="content">
    <h1 style="text-align: center">Events Photos</h1>
    <c:choose>
        <c:when test="${requestScope.galleries.size()<1}">
            <p class="paragraph">No previous News</p>
        </c:when>
        <c:otherwise>
            <c:forEach var="i" begin="0" end="${requestScope.galleries.size()-1}">
                <div class="responsive">
                    <div class="gallery">
                        <!--<a target="_blank" href="img_5terre.jpg">-->
                        <img src="data:image/jpg;base64,${requestScope.galleries[i].getPhotoString()}" alt="${requestScope.galleries[i].getCaption()}" width="600" height="400">
                        <!--</a>-->
                        <div class="desc">${requestScope.galleries[i].getCaption()}</div>
                    </div>
                </div>
            </c:forEach>
        </c:otherwise>
    </c:choose>

</div>
<%@ include file="includes/footer.jsp"%>