<html>
<body>
<form action="Welcome.php" method="post">
    <div>
        Fullname
        <input type="text" name="fullname">
        <br/><br/>
        Email
        <input type="text" name="email">
        <br/><br/>
        Username
        <input type="text" name="username">
        <br/><br/>
        Password
        <input type="text" name="password">
        <br/><br/>
        <input type="submit" name="REGISTER" value="REGISTER"/>
            <?php require_once 'Register.php'; ?>
    </div>
</form>
</body>
</html>
