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
<#assign boardNo = board.boardNo>

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
        <h5 style="float: left"> Views : ${board.boardViews}
            &ensp;<form name="likes" action="board/${boardNo}/likes " method="post">
                <input type="submit" value="Likes : ${board.boardLikes}">
            </form>&ensp;
        </h5>
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