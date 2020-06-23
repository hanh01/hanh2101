<?php
session_start();
$myname = $_SESSION['myname'];
session_unset();
session_destroy();
echo "Session descroyed!";
?>
<html>
<head>
    <title>
        Session
    </title>
</head>
<body>
<a href="snippet2.php">Homepage of Mypage.com</a>
</body>
</html>
