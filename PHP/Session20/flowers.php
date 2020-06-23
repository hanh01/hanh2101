<HTML>
<HEAD>
    <TITLE> Flowers Details </TITLE>
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
echo "<TD> F004 </TD>";
echo "<TD><A HREF=''> Tulip Bouquet </A></TD>";
echo "<TD> $6.00 </TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD> F010 </TD>";
echo "<TD><A HREF=''> Red Rose Bouquet </A></TD>";
echo "<TD> $8.00 </TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD> F011 </TD>";
echo "<TD><A HREF=''> Lilacs </A></TD>";
echo "<TD> $10.00 </TD>";
echo "</TR>";
echo "</TABLE>";
echo "</CENTER>";
?>
</BODY>
</HTML>
