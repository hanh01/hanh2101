<?php
$connect_mysql = mysqli_connect("localhost","root","");
$result = mysqli_query($connect_mysql,"SELECT * FROM Employees");
$rows = $result->num_rows;
echo "The table contains $rows rows.<br>";
mysqli_close($connect_mysql);
echo "The connection to the database has been closed.";
