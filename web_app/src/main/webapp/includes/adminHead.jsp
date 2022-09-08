<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 08-Sep-22
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<html>

<head>
    <title>Admin-Panel</title>
    <%--    set title of the page from attribute title from session--%>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        <%@include file="../assets/style.css"%>
    </style>
    <script>
        <%@include file="../assets/style.js"%>
    </script>

</head>

<body>

<div class="topnav" id="myTopnav">

    <div class="menu">
        <a href="" class="name_in_nav" >Admin-Panel</a>
        <a href="" class="" id="menu1">Home</a>
        <a href="" id="menu2">Constitution</a>
        <a href="" id="menu3">Gallery</a>
        <div class="dropdown">
            <button class="dropbtn" id="menu4">News&Notice
                <i class="fa fa-caret-down"></i>
            </button>
            <div class="dropdown-content">
                <a href="Notice">Notice</a>
                <a href="Notice">News</a>
                <a href="Notice">Event</a>
            </div>

        </div>

        <a href="" id="menu5">Members</a>

        <a href="" id="menu6">Advisor</a>
        <a href="" id="menu7">Alumni</a>

        <div class="dropdown">
            <button class="dropbtn" id="menu8">Executive Committee
                <i class="fa fa-caret-down"></i>
            </button>
            <div class="dropdown-content">
                <a href="#">Current Committee</a>
                <a href="#">11th</a>
                <a href="#">10th</a>
            </div>

        </div>
        <div class="dropdown">
            <button class="dropbtn" id="menu9">Culture
                <i class="fa fa-caret-down"></i>
            </button>
            <div class="dropdown-content">
                <a href="">Culture</a>
                <a href="#">Heritage</a>
            </div>

        </div>
        <a href="#about" id="menu10">About</a>
    </div>


    <a href="javascript:void(0);" style="font-size:30px;" class="icon option" onclick="myFunction()">&#9776;</a>



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
        document.getElementById("menu1").className += 'active';
    }
    else if(pageName === "constitution.jsp") {
        document.getElementById("menu2").className += 'active';
    }
    else if(pageName === "Members" || pageName === "members.jsp" || pageName === "MemberDetails"){
        document.getElementById("menu5").className += 'active';
    }

</script>
