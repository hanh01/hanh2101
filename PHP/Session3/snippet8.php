<?php
  include 'snippet7.php';
  use aptech\{Boston, NewYork};
  use function aptech\{foo1,foo2};
    $d = new Boston();
    $d ->say();
    $n = new NewYork();
    $n ->say();
    foo1();
    foo2();
?>
