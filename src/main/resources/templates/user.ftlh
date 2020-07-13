<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>User Page</title>
</head>
<body>
<!-- Header -->
<div style="position: fixed;
top: 0;
left: 0;
right: 0;

height: 75px;
padding: 1rem;
color: white;
background: skyblue;
font-weight: bold;
display: flex;
justify-content: space-between;
align-items: center;">
    <div style="display: inline; ">
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
</div>
<br/><br/><br/><br/>

<!-- end of Nav -->

<h2> my information</h2><br/><br/>

<h3> Id : ${user.userId}</h3><br/>
<h3> Name : ${user.userName}</h3><br/>
<h3> Email : ${user.userEmail}</h3><br/>
<h3> Phone Number : ${user.userTell}</h3><br/>


</body>
</html>