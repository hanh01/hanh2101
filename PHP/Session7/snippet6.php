<?php
$anon_class_obj = new class{
    public $greeting = 'Hello';
    public $Id = 754;
    const SETT = 'Some configuration';
    public function getValue(){
        return 'Some returned value';
    }
    public function getValueWithArg($str1){
        return 'Returned value is '.$str1;
    }
};
echo '<br>';
echo $anon_class_obj ->greeting;
echo '<br>';
echo $anon_class_obj -> Id;
echo '<br>';
echo $anon_class_obj::SETT;
echo '<br>';
echo $anon_class_obj -> getValue();
echo '<br>';
echo $anon_class_obj -> getValueWithArg('Aptech');
echo '<br>';
echo '<br>';
?>