
<?php
$_SESSION['username'] = "Admin";
?>

<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <section class="register">
            <h1>Register</h1>
            <div class="register-container">
                <?php
                include_once 'login.php';
                $sql = "SELECT * FROM users ORDER BY id DESC;";
                $stmt = mysqli_stmt_init($conn);
                if (!mysqli_stmt_prepare($stmt, $sql)) {
                    echo "SQL statement failed!";
                } else {
                    mysqli_stmt_execute($stmt);
                    $result = mysqli_stmt_get_result($stmt);
                }
                ?>

            <?php
            if (isset($_SESSION['username'])) {
                echo '<div class="register-upload">
              <h3>Upload</h3>
              <form action="upload.php" method="post" enctype="multipart/form-data">
                <input type="text" name="fullname" placeholder="Full name..."> <br><br>
                <input type="email" name="email" placeholder="Email..."> <br><br>
                <input type="text" name="username" placeholder="Username..."> <br><br>
                <input type="password" name="password" placeholder="Password..."> <br><br>
                <button type="submit" name="submit">REGISTER</button>
              </form>
            </div>';
            }
            ?>
        </div>
    </section>
</body>
</html>