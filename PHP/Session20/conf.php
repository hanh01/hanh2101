<HTML>
<HEAD>
    <TITLE> Confectionery Details </TITLE>
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
echo "<TD> c001 </TD>";
echo "<TD><A HREF=''> Vanilla Crush </A></TD>";
echo "<TD> $4.00 </TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD> c002 </TD>";
echo "<TD><A HREF=''> Choco Chunks </A></TD>";
echo "<TD> $7.00 </TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD> c002 </TD>";
echo "<TD><A HREF=''> Strawberry Delight </A></TD>";
echo "<TD> $9.00 </TD>";
echo "</TR>";
echo "</TABLE>";
echo "</CENTER>";
?>
</BODY>
</HTML>
