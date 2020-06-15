<?php
$number = $_GET['num'];
if($number == 0){
    exit;
}
$ans = 1/$number;
echo "<br>Inverse of the entered number is 1/$number";
echo "<br><br>Its decimal equivalent is $ans";
echo "<br><br><a href=snippet4.html>Go Back</a>";