<?php

$username = filter_input(INPUT_POST,"username");
$password = filter_input(INPUT_POST,"password");

$mysqli = new mysqli("localhost","root","","ppb_projek");

$result = mysqli_query($mysqli,"SELECT*FROM users WHERE username = '".$username."' and password = '".$password."'");

if($data = mysqli_fetch_array($result)){
    echo '1';
}

?>