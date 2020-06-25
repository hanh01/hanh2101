<?php
$fn = $_POST['fullname'];
if (isset($_POST['submit'])) {
    $fullname = $_POST['fullname'];
    $email = $_POST['email'];
    $username = $_POST['username'];
    $password = $_POST['password'];
    $hash = password_hash($password, PASSWORD_DEFAULT);

    include_once "login.php";
    $sql = "SELECT * FROM users;";
    $stmt = mysqli_stmt_init($conn);
    if (!mysqli_stmt_prepare($stmt, $sql)) {
        echo "SQL statement failed!";
    } else {
        mysqli_stmt_execute($stmt);
        $result = mysqli_stmt_get_result($stmt);
        $sql = "INSERT INTO users (fullname, email, username, password) VALUES (?,?,?,?);";
        if (!mysqli_stmt_prepare($stmt, $sql)) {
            echo "SQL statement failed!";
        } else {
            mysqli_stmt_bind_param($stmt, "ssss", $fullname, $email, $username, $password);
            mysqli_stmt_execute($stmt);
            $fullname = $_GET['fullname'];
            setcookie("fullname", $fullname);
            $username = $_GET['username'];
            setcookie("username", $username);
            header("Location: ../welcome.php?upload=success");
        }
    }
}

?>
