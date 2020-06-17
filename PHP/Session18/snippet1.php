<?php
$connect_mysql = mysqli_connect('localhost','root','abc123','customers');
$mysqli_db = mysqli_select_db($connect_mysql,"Current");

if(!$mysqli_db){
    die("Connection failed");
}
else{
    echo "Current Database is selected";
}
