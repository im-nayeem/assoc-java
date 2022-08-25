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
    <title>${title}</title>
<%--    set title of the page from attribute title from session--%>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
        <img src="data:image/jpg;base64,${assocInfo.getAssocLogo()}" alt="logo"/>
    </div>
    <div class="name">
        <h3>${assocInfo.getAssocName()},Comilla University</h3>
        <!-- show in large window -->
        <h3>${assocInfo.getAssocName()} <br> Comilla University</h3>
        <!-- show in small window -->
    </div>

</div>
<div class="topnav" id="myTopnav">

    <div class="menu">
        <a href="./" class="name_in_nav">MSWA-CoU</a>
        <a href="./" class="active">Home</a>
        <a href="constitution.jsp">Constitution</a>
        <a href="">Gallery</a>
        <a href="">Notice</a>


        <div class="dropdown">
            <button class="dropbtn">Members
                <i class="fa fa-caret-down"></i>
            </button>
            <div class="dropdown-content">
                <a href="#">...</a>
                <a href="#">...</a>
                <a href="#">...</a>
            </div>

        </div>




        <a href="#contact">Advisor</a>
        <a href="#contact">Alumni</a>

        <div class="dropdown">
            <button class="dropbtn">Executive Committee
                <i class="fa fa-caret-down"></i>
            </button>
            <div class="dropdown-content">
                <a href="#">Current Committee</a>
                <a href="#">11th</a>
                <a href="#">10th</a>
            </div>

        </div>
        <a href="#about">Culture</a>
        <a href="#about">About</a>
    </div>



    <a href="javascript:void(0);" style="font-size:30px;" class="icon option" onclick="myFunction()">&#9776;</a>


    <div class="login_signup">
        <a href="registration.jsp">Register</a>
        <a href="login.jsp">Log-In</a>
    </div>


</div>
