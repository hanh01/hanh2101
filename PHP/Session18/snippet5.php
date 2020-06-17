<?php
$result = mysqli_query($connect_mysql, "SELECT * FROM Employees");
while ($row = mysqli_fetch_row($result)){
    printf("%s (%s)\n", $row[0], $row[1]);
}
