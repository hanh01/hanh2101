<?php
session_start();
$myname = $_SESSION['myname'];
?>
<html>
<head>
    <title>
        Homepage
    </title>
</head>
<body>
Welcome <?php echo $myname ?> to MyPage.com <br>
</body>
</html>
