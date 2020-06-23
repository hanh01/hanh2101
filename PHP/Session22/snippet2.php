<html>
<body>
<?php
$to = "recipent1@example.com, recipient2@example.com,
recipient3@example.com";
$from = "yourname@example.con";
for($i=0;$i<count($to);$i++){
    $to[$i] = trim($to[$i]);
    $subject = "An example";
    $body = "this is an example for showing the usage of the mail() function.";
    $send = mail($to ,$subject, $body, $from);
    if($send){
        echo "mail was sent to all te address!!";
    }
}
?>
</body>
</html>