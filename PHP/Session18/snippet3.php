<?php
$connect = mysqli_connect("localhost","root","");
if($result = mysqli_query($connect,"SELECT * FROM Employees")){
    $rows = mysqli_num_rows($result);
    echo "The table contains $rows rows.<br>";
}
