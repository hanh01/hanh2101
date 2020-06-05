<html>
<head>
<title>
    Employee Details
</title>
</head>
<body>
<h4>Enter your details</h4>
<form action="emp_details.php" method="post">
    <table>
        <tr>
            <td>Employee ID</td>
            <td><input type="text" name="empid"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Department</td>
            <td>
                <input type="radio" name="dept" value="Finance">Finance
                <input type="radio" name="dept" value="Marketing">Marketing
                <input type="radio" name="dept" value="IT">IT
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <input type="text" name="email" >
            </td>
        </tr>
    </table>
    <br>
    <td><input type="submit" value="submit"</td>
</form>
</body>
</html>
