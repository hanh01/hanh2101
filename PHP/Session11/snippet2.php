<html>
<head>
    <title>User Information</title>
</head>
<body>
<?php
 $myname = $_POST['myname'];
 $myage = $_POST['myage'];
 if($myname==""){
     echo "Please enter your name";
 }else{
     if($myage==""){
         echo $myname;
         echo ",you did noy enter your age!";
     }else{
         echo "Hi ";
         echo $myname;
         echo ". ";
         echo "Your age is ";
         echo $myage;
         echo ". ";
     }
 }
?>
<br>
<a href="snippet3.html">Back</a>
</body>
</html>
