<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 24-Aug-22
  Time: 1:25 PM
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<html>

<head>
    <title>${applicationScope.assocInfo.getAssocName()}</title>
<%--    set title of the page from attribute title from session--%>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="icon" type="image/x-icon" href="data:image/jpg;base64,${applicationScope.assocInfo.getAssocLogo()}">
    <style>
        <%@include file="../assets/style.css"%>
    </style>
    <script>
        <%@include file="../assets/style.js"%>
    </script>

</head>

<body>
<div class="header" id="header">
    <div class="logo">
        <img src="data:image/jpg;base64,${applicationScope.assocInfo.getAssocLogo()}" alt="logo"/>
    </div>
    <div class="name">
        <h3>${applicationScope.assocInfo.getAssocName()},${applicationScope.varsityInfo.getVarsityName()}</h3>
        <!-- show in large window -->
        <h3>${applicationScope.assocInfo.getAssocName()}<br>${applicationScope.varsityInfo.getVarsityName()}</h3>
        <!-- show in small window -->
    </div>

</div>
<div class="topnav" id="myTopnav">

    <div class="menu">
        <a href="./" class="name_in_nav" >MSWA-CoU</a>
        <a href="./" class="" id="home">Home</a>
        <a href="constitution.jsp" id="constitution">Constitution</a>
        <a href="UserGallery" id="gallery">Gallery</a>
        <div class="dropdown">
            <button class="dropbtn" id="newsNotice">News&Notice
                <i class="fa fa-caret-down"></i>
            </button>
            <div class="dropdown-content">
                <a href="Notice">Notice</a>
                <a href="News">News</a>
                <a href="Notice">Event</a>
            </div>

        </div>

        <a href="Members" id="members">Members</a>

        <a href="adviser-panel?t=all" id="menu6">Adviser</a>
        <a href="" id="menu7">Alumni</a>

        <div class="dropdown">
            <button class="dropbtn" id="exeCommittee">Executive Committee
                <i class="fa fa-caret-down"></i>
            </button>
            <div class="dropdown-content">
<%--                use jstl to show all committee--%>
            </div>

        </div>
        <div class="dropdown">
            <button class="dropbtn" id="culture">Culture
                <i class="fa fa-caret-down"></i>
            </button>
            <div class="dropdown-content">
                <a href="">Culture</a>
                <a href="">Heritage</a>
            </div>

        </div>
        <a href="#about" id="about">About</a>
    </div>



    <a href="javascript:void(0);" style="font-size:30px;" class="icon option" onclick="myFunction()">&#9776;</a>
    <div class="login_signup">
        <c:choose>
            <c:when test="${not empty sessionScope.userProfile.getName()}">
                <a href="Dashboard">${sessionScope.userProfile.getName()}</a>
            </c:when>
            <c:when test="${not empty sessionScope.adviserProfile.getName()}">
                <a href="Dashboard">${sessionScope.adviserProfile.getName()}</a>
            </c:when>
            <c:otherwise>
                <a href="Registration">Register</a>
                <a href="Login">Log-In</a>
            </c:otherwise>
        </c:choose>
    </div>


</div>
        <script>
            //get current link
            var link = window.location.href;
            var tmp = "";
            //retrieve jsp file name
            for (var i = link.length - 1; i >= 0; i--) {
                if (link[i] === '/')
                    break;
                if(link[i] === '?'){
                    tmp="";continue;
                }
                tmp += link[i];
            }
            var pageName = "";
            //reverse jsp file name
            for (var i = tmp.length - 1; i >= 0; i--) {
                pageName += tmp[i];
            }
            
            //compare with all jsp file name
            if(pageName === "index.jsp" || pageName.length===0){
                document.getElementById("home").className += 'active';
            }
            else if(pageName === "constitution.jsp") {
                document.getElementById("constitution").className += 'active';
            }
            else if(pageName === "Members" || pageName === "members.jsp" || pageName === "MemberDetails" || pageName === "members-filter"){
                document.getElementById("members").className += 'active';
            }
            else if(pageName === "Gallery" || pageName === "gallery.jsp"){
                document.getElementById("gallery").className += 'active';
            }
            else if(pageName === "News" || pageName === "Notice" || pageName === "Event"){
                document.getElementById("newsNotice").style.background = "#04AA6D";
                document.getElementById("newsNotice").style.color = "white";
            }
            
        </script>
