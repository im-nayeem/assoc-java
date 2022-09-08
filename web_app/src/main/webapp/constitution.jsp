<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 25-Aug-22
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<% session.setAttribute("title","Constitution"); %>
<%@include file="includes/head.jsp"%>

<style>
    .content .tmp a{
        text-decoration: none;
        color:white;
        padding: 20px;
    }
    .content .tmp{
        width: max-content;
        margin: 10% auto;
    }
    .content{
        text-align: center;
    }
</style>
<div class="content" id="content">
    <div class="tmp"><a href="Constitution">Download Constitution as PDF</a></div>
    
</div>
<%@ include file="includes/footer.jsp"%>