<?php
echo "The odd numbers in reverse order are:";
for($i=5; $i>=1;$i--){
    $number = $i *2 -1;
    echo "<br>$number";
}
echo "<br>The loop ends because the condition is satisfied.";
