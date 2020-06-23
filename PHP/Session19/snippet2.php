<?php
$mapname = $_GET['fmapname'];
setcookie("mycookie", $mapname, time()+86400, "/Webmap/", ".Webworldmaps.com");
?>
