<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>login</title>
</head>
<body>
<div style="display: inline">
    <a href="http://localhost:8081/"><h3 style="float: left">Simple Board</h3>
    </a>
</div>
<br/>
<form style="float: right; margin-right: 30%;"
      name="search" action="search" method="get">
    <input type="search" name="title" placeholder="search by title">
    <input type="submit" value="SEARCH">
</form>
<br/><br/>

<h2>Sign in to simple board</h2>

<form name="login" action="login" method="post">
    <h3> id </h3> <input type="text" name="inputId">
    <h3> Password </h3> <input type="password" name="inputPwd">
    <br/><br/>
    <input type="submit" value="Sign in">
</form>

</body>
</html>