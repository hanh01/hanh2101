<?php
require_once 'login.php';
$conn = new mysqli($hn, $un, $pw, $db);
if($conn ->connect_error) die("Fatal Error");

$query = "SELECT * FROM customers";
$result = $conn ->query($query);
if(!$result) die("Fatal Error");

$rows = $result -> num_rows;

for($j = 0; $j < $rows; ++$j){
    $row = $result -> fetch_array(MYSQLI_ASSOC);

    echo 'Name: '  .$row['name']  .'<br>';
    echo 'Isbn: '   .$row['isbn']   .'<br>';
}

$result -> close();
$conn -> close();