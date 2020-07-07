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

<h3> user Information</h3>
<#list userList as user>
      ${user_index+1} ${user.userName} ${user.userTell}  <br/>
</#list>
</h4>
</body>
</html>