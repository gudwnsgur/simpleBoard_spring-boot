<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>User Page</title>
</head>
<body>
<h3> user Information</h3>
<#list userList as user>
      ${user_index+1}  ${user.userName}     ${user.userTell}  <br/>
</#list>
</h4>
</body>
</html>