<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>User Page</title>
</head>
<body>
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

<#if sessionId??>
    <div style="display: inline;">
        <a href="http://localhost:8081/logout" style="margin-left: 60%"> Sign out </a>
        <a href="http://localhost:8081/user" style="margin-left: 5%"> Go to user page </a><br/>
    </div>
<#else>
    <div style="display: inline;">
        <a href="http://localhost:8081/login" style="margin-left: 65%"> Sign in </a>
        <a href="http://localhost:8081/join" style="margin-left: 5%"> Sign up </a> <br/>
    </div>
</#if>

<h2> my information</h2><br/><br/>

<h3> Id : ${user.userId}</h3><br/>
<h3> Name : ${user.userName}</h3><br/>
<h3> Email : ${user.userEmail}</h3><br/>
<h3> Phone Number : ${user.userTell}</h3><br/>


</body>
</html>