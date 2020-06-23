<?php

//Store the value of the cookie logname
$logcookie=$_COOKIE['logname'];

// Display the various items available for shopping:
echo "<HTML>";
echo "<HEAD>";
echo "<TITLE> Homepage</TITLE>";
echo "</HEAD>";
echo "<BODY>";
echo "<ALIGN = 'right'>";

//Display the value of the cookie logcookie
echo "Welcome $logcookie";
echo "<BR><A HREF='logout.php'>Logout</A>";
echo "<CENTER>";
echo "<H3> Shopper's Paradise </H3>";
echo "<H5> Shop till you drop!!! </H5>";
echo "<HR>";
echo "<BR>";
echo "<TABLE>";
echo "<TR ALIGN = 'center'>";
echo "<TD><A HREF='conf.php'>Confectionery</A></TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD><A HREF='flowers.php'>Flowers</A></TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD><A HREF='access.php'>Accessories</A></TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD><A HREF='perf.php'>Perfumes</A></TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD><A HREF='apparel.php'>Apparel</A></TD>";
echo "</TR>";
echo "</TABLE>";
echo "</CENTER>";
echo "</BODY>";
echo "</HTML>";
?>
