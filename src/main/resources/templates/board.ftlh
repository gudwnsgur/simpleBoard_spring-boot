<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>board</title>
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
        <h5>${board.boardContent}</h5>
    </div>
    <h5 style="float: right; margin-right:5%;"> ${board.boardDate} </h5>
    <br/>

    <div style="display:inline">
        <h5> Views : ${board.boardViews}     </h5>
        <form name="likes" action="board/${boardNo}/likes " method="post">
            <input type="submit" value="Likes : ${board.boardLikes}">
        </form>&ensp;
    </div>
</div>
<br/><br/>

<h5 style="float: left">Comments : ${board.commentCount} </h5>
<br/><br/><br/>
<#list commentList as comment>
    <div style="display: inline-block">
        <h5 style="float: left; margin-right: 10px">[${comment.userName}] ${comment.commentContent} </h5>
        <h5 style="float: right;">Likes:${comment.commentLikes}     ${comment.commentDate}</h5>
    </div>
    <br/><br/>
</#list>

</body>
</html>