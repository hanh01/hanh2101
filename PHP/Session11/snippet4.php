<html>
<head>
    <title>Grade Details</title>
</head>
<body>
<?php
$myname = $_GET['myname'];
$mygrade = $_GET['mygrade'];
echo "<br>";
if($myname == ""){
    echo "Please enter your name";
}else{
    switch ($mygrade){
        case "":
            echo $myname;
            echo ", you did not enter your Grade!";
            break;
        case "A":
            echo "Facilities for $myname (Grade A)";
            echo "<br><br>";
            echo "Increment = 30% of basic salary";
            echo "<br>";
            echo "Bonus = 20% of basic salary";
            echo "<br>";
            echo "Traveling allowance = $500";
            echo "<br>";
            echo "Medical allowance = $500";
            echo "<br>";
            break;
        case "B":
            echo "Facilities for $myname (Grade B)";
            echo "<br><br>";
            echo "Increment = 20% of basic salary";
            echo "<br>";
            echo "Bonus = 10% of basic salary";
            echo "<br>";
            echo "Traveling allowance = $300";
            echo "<br>";
            echo "Medical allowance = $300";
            echo "<br>";
            break;
        case "C":
            echo "Facilities for $myname (Grade C)";
            echo "<br><br>";
            echo "Increment = 10% of basic salary";
            echo "<br>";
            echo "Bonus = 5% of basic salary";
            echo "<br>";
            echo "Traveling allowance = $100";
            echo "<br>";
            echo "Medical allowance = $100";
            echo "<br>";
            break;
        default:
            echo "$myname, Please enter the correct Grade (A,B or C)";
            break;
    }
}

?>
<a href="snippet3.html">Back</a>
</body>
</html>
