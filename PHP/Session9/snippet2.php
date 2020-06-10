<?php
$a = $_GET['passtext'];
if($a == 'pass'){
    echo "You are a Valid User.";
}else{
    echo "Sorry, you are an Invalid User.";
}
