<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>Simple Board</title>
</head>
<body>
<h3>Simple Board</h3>
<a href="http://localhost:8081/login"> Sign in </a> <br/>
<a href="http://localhost:8081/join"> Sign up </a> <br/><br/>

<#list boardList as board>


    <h4>${board.boardTitle} &emsp; &emsp; &emsp; [${board.userName}] </h4>
    <div style="border:1px solid;
                margin-right: 30%;">
        <h5>${board.boardContent} <br/></h5>
    </div>
    <div style="float:right;
                margin-right : 30%;">
        <h5> Views : ${board.boardViews} Likes : ${board.boardLikes} </h5>
    </div>
    <br/><br/>
</#list>
<br/><br/>
<a href="http://localhost:8081/users"> Go to User page </a>
</body>
</html>
