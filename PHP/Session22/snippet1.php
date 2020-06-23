<html>
<body>
<?php
$to = "recipient@example.com";
$from = "yourname@example.com";
$subject = "Test e-nail";
$body = "This is an example for showing the usage of the mail() function.";
$send = mail($to, $subject, $body, $from);
if($send)
{
    echo "Mail sent to $to address!!!";
}else{
    echo "Mail could not be sent to $to address";
}
?>
</body>
</html>
