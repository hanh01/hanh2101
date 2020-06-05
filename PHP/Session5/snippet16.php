<?php
if(isset ($_COOKIE['Name'])){
    $last = $_COOKIE['Name'];
    echo "Welcome back!  <br> Your name is " . $last;
}
else{
    echo "welcome to our site!";
}
?>
