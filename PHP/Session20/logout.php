<?php
$logcookie=$_COOKIE['logname'];

// Deletes logname cookie
setcookie("logname");

// Redirects users to the main information.html page for login
Header("Location: information.html");
?>
