<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 25-Aug-22
  Time: 12:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html>

<head>
    <title>${title}</title>
    <%--    set title of the page from attribute title from session--%>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="icon" type="image/x-icon" href="data:image/jpg;base64,${applicationScope.assocInfo.getAssocLogo()}">

    <style>
        <%@include file="../assets/style.css"%>
        <%@include file="../assets/form.css"%>

    </style>
<%--    <%@include file=""%>--%>
    <script>
        <%@include file="../assets/style.js"%>
        <%@include file="../assets/validation.js"%>
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
        <a href="" class="name_in_nav">MSWA-CoU</a>
        <a href="../assets" class="active">Home</a>
        <a href="">Constitution</a>
        <a href="#contact">Gallery</a>
        <a href="constitution.html">Notice</a>


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
        <a href="register-login.html#id01">Register</a>
        <a href="register-login.html#id02">Log-In</a>
    </div>


</div>

