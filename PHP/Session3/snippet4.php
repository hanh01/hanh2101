<html>
    <body>
    <?php
        $x = array();
        $y = array();
        echo 'array()'.'<=>'.'array()'.' Returns ', $x <=> $y;
        echo '</br>';
    $m = array(1,2,3);
    $n = array(1,2,3);
    $p = array(1,2,1);
    $q = array(1,2,4);
    echo 'array(1,2,3)'.'<=>'.'array(1,2,3)'.' Returns ',$m <=> $n;
    echo '</br>';
    echo 'array(1,2,3)'.'<=>'.'array()'.' Returns ',$m <=> $x;
    echo '</br>';
    echo 'array(1,2,3)'.'<=>'.'array(1,2,1)'.' Returns ',$m <=> $x;
    echo '</br>';
    echo 'array(1,2,3)'.'<=>'.'array(1,2,4)'.' Returns ', $m <=> $q;
    ?>
    </body>
</html>
