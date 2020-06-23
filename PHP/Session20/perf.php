<HTML>
<HEAD>
    <TITLE> Perfumes Details </TITLE>
</HEAD>
<BODY>
<?php
$logcookie=$_COOKIE['logname'];
echo "</HEAD>";
echo "</BODY>";
echo "<CENTRE>";
echo "<ALIGN = 'right'>";
echo "Welcome $logcookie";
echo "<BR><A HREF='logout.php'>Logout</A>";
echo "<CENTER>";
echo "<H3> Shopper's Paradise </H3>";
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
echo "<TD> P002 </TD>";
echo "<TD><A HREF=''> Charles </A></TD>";
echo "<TD> $38.00 </TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD> P008 </TD>";
echo "<TD><A HREF=''> Maui Rain </A></TD>";
echo "<TD> $30.00 </TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD> P018 </TD>";
echo "<TD><A HREF=''> Night Mist </A></TD>";
echo "<TD> $25.00 </TD>";
echo "</TR>";
echo "</TABLE>";
echo "</CENTER>";
?>
</BODY>
</HTML>
