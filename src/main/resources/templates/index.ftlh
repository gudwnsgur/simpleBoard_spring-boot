<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>Simple Board</title>
</head>
<body>
<h3>Simple Board</h3>
<a href="http://localhost:8081/login"> Sign in </a> <br/>
<a href="http://localhost:8081/join"> Sign up </a> <br/>
<a href="http://localhost:8081/users"> Go to User page </a><br/><br/>
<#list boardList as board>
    <div style="display: inline">

        <div style="display: inline">
            <h4 style="float:left"> ${board.boardTitle} </h4>
            <h5 style="float:right; margin-right:5%;">[${board.userName}] </h5>
        </div>
        <br/><br/>
        <div style="border:1px solid;
                    margin-right: 5%; ">
            <h5>${board.boardContent} <br/></h5>
        </div>

        <div style="display:inline">
            <h5 style="float: left"> Views : ${board.boardViews} &ensp; Likes : ${board.boardLikes} &ensp; Comments : ${board.commentCount}</h5>
            <h5 style="float: right; margin-right:5%;"> ${board.boardDate} </h5>
        </div>
    </div>
    <br/><br/>
</#list>
<br/><br/>
</body>
</html>
