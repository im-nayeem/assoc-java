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
    .constitution-pdf{
        width:18%;
        padding:10px;
        text-align: center;
        margin: 10% auto;
    }
    .constitution-pdf a{
        color:white;
        font-weight: bold;
        text-decoration: none;
    }
</style>
<div class="content" id="content">
    <div class="constitution-pdf"><a href="Constitution">Download Constitution as PDF</a></div>
    
</div>
<%@ include file="includes/footer.jsp"%>