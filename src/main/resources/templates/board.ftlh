<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>board</title>
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

<div style="display: inline">

    <div style="display: inline">
        <a href="http://localhost:8081/board?no=${board.boardNo}">
            <h4 style="float:left"> ${board.boardTitle} </h4>
        </a>
        <h5 style="float:right; margin-right:5%;">[${board.userName}] </h5>
    </div>
    <br/><br/>
    <div style="border:1px solid;
                    margin-right: 5%; ">
        <h5>${board.boardContent} <br/></h5>
    </div>

    <div style="display:inline">
        <h5 style="float: left"> Views : ${board.boardViews} &ensp; Likes : ${board.boardLikes} &ensp; </h5>
        <h5 style="float: right; margin-right:5%;"> ${board.boardDate} </h5>
    </div>
</div>
<br/><br/><br/>

<h5>Comments : ${board.commentCount} </h5>

<#list commentList as comment>
    <div style="display: inline-block">
        <h5 style="float: left; margin-right: 10px">[${comment.userName}] ${comment.commentContent} </h5>
        <h5 style="float: right;">Likes:${comment.commentLikes}     ${comment.commentDate}</h5>
    </div>
    <br/><br/>
</#list>


</body>
</html>