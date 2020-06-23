<html>
<head>
    <title>
        Accessories Details
    </title>
</head>
<body>
<?php
$logcookie = $_COOKIE['logname'];
echo "</head>";
echo "</body>";
echo "<CENTRE>";
echo "<ALIGN = 'right'>";
echo "Welcome $logcookie";
echo "<br><a href='logout.php'>Logout</a>";
echo "<CENTRE>";
echo "<h3> Shopper's Paradise</h3> ";
echo "<H5> Shop till you drop!!! </H5>";
echo "<HR>";
echo "<BR>";
echo "<TABLE BORDER='1'>";
echo "<TR ALIGN = 'center'>";
echo "<TH>Code</TH>";
echo "<TH>Name</TH>";
echo "<TH>Price</TH>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD> A001 </TD>";
echo "<TD><A HREF=''> Diamond Bracelet </A></TD>";
echo "<TD> $95.00 </TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD> A006 </TD>";
echo "<TD><A HREF=''> Diamond Ring </A></TD>";
echo "<TD> $80.00 </TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD> A012 </TD>";
echo "<TD><A HREF=''> Diamond Earrings </A></TD>";
echo "<TD> $50.00 </TD>";
echo "</TR>";
echo "</TABLE>";
echo "</CENTER>";
?>
</body>
</html>
