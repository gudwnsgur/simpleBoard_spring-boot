<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>join page</title>


    <!-- jQuery -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous">
    </script>

    <!-- Bootstrap CSS -->

    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
          crossorigin="anonymous">


    <script>
        $(document).on('click', '#btnSave', function (e) {
            e.preventDefault();
            $("#form").submit();
        });
        $(document).on('click', '#btnList', function (e) {
            e.preventDefault();
            location.href = "/";
        });
    </script>

    <style>
        body {
            padding-top: 70px;
            padding-bottom: 30px;
        }
    </style>
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
<article>
    <div class="container" role="main">

        <h2>Write Comment</h2>

        <form name="comment" id="form" role="form" method="post"  action="comment">

            <div class="mb-3">
                <label for="content">Content</label>
                <textarea class="form-control" rows="5" name="content" id="content"
                          placeholder="write Content"></textarea>
            </div>

        </form>

        <div>
            <button type="button" class="btn btn-sm btn-primary" id="btnSave">Save</button>
            <button type="button" class="btn btn-sm btn-primary" id="btnList">List</button>
        </div>

    </div>

</article>



</body>
</html>