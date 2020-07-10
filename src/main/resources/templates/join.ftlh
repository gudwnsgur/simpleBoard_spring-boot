<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>join page</title>
</head>
<body>
<!-- Header -->
<div style="display: inline">
    <a href="http://localhost:8081/"><h3 style="float: left">Simple Board</h3>
    </a>
</div>
<br/>
<form style="float: right; margin-right: 30%;"
      name="search" action="search" method="get">
    <input type="search" name="title" placeholder="search for title">
    <input type="submit" value="SEARCH">
</form>
<br/><br/>
<!-- end of Header -->

<!-- Nav -->
<#if sessionId??>
    <div style="float: right">
        <a href="http://localhost:8081/logout" style="margin-right: 5%"> SignOut </a> <br/>
        <a href="http://localhost:8081/user" style="margin-right: 5%"> userPage </a><br/>
    </div>
    <a href="http://localhost:8081/write" style="float: right; margin-right: 5%"> Write Content </a>
<#else>
    <div style="float: right">
        <a href="http://localhost:8081/login" style="margin-right: 5%"> SignIn </a>
        <a href="http://localhost:8081/join" style="margin-right: 5%"> SignUp </a> <br/>
    </div>
</#if>
<!-- end of Nav -->

<h2>Sign Up</h2>

<form name="join" action="join" method="post">
    <h3> id </h3> <input type="text" name="inputId">
    <h3> Password </h3> <input type="password" name="inputPwd1">
    <h3> Validate Password </h3> <input type="password" name="inputPwd2">
    <h3> Name </h3> <input type="text" name="inputName">
    <h3> Email </h3> <input type="email" name="inputEmail">
    <h3> Phone Number </h3> <input type="tel" name="inputTell">
    <br/><br/>
    <input type="submit" value="Sign up for SimpleBoard">

</form>

</body>
</html>