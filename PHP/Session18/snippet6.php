<?php
$server = "";
$username = "root";
$password = "";
$connect_mysql = mysqli_connect($server, $username, $password ,'USER');
if($connect_mysql){
    echo "Connection established<br>";
}else{
    die("Unable to connect<br>");
}
$mysql_bd = mysqli_select_db($connect_mysql, "User");
if($mysql_bd){
    echo "Connected to the database<br>";
}
else{
    die("Unable to connect to the database<br>");
}
$sql_table = "CREATE TABLE USER_CONTACT("."USER_ID INT NOT NULL PRIMARY KEY,"."USER_NAME CHAR(25) NOT NULL, "."USER_EMAIL_ID CHAR(25)".")";

if(mysqli_query($connect_mysql, $sql_table)){
    echo "Table is created<br>";
}else{
    die("Unable to create the table<br>");
}
