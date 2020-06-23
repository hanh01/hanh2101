<HTML>
<HEAD>
    <TITLE> Apparel Details </TITLE>
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
echo "<TD> AP001 </TD>";
echo "<TD><A HREF=''> Three piece Suit </A></TD>";
echo "<TD> $200.00 </TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD> AP018 </TD>";
echo "<TD><A HREF=''> Wrinkle-free pant </A></TD>";
echo "<TD> $190.00 </TD>";
echo "</TR>";
echo "<TR ALIGN = 'center'>";
echo "<TD> AP020 </TD>";
echo "<TD><A HREF=''> Wrinkle-free shirt </A></TD>";
echo "<TD> $120.00 </TD>";
echo "</TR>";
echo "</TABLE>";
echo "</CENTER>";
?>
</BODY>
</HTML>
