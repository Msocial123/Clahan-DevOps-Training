<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
</head>
<body>

<?php
// Check if the form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Retrieve user input from the form
    $username = $_POST["username"];
    $password = $_POST["password"];

    // In a real-world scenario, you should validate and sanitize the input

    // Verify the username and password (dummy credentials for demonstration)
    $validUsername = "demo_user";
    $validPassword = "demo_pass";

    if ($username == $validUsername && $password == $validPassword) {
        // Authentication successful
        echo "<p>Login successful!</p>";
    } else {
        // Authentication failed
        echo "<p>Invalid username or password. Please try again.</p>";
    }
}
?>

<!-- HTML form for login -->
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br>

    <input type="submit" value="Login">
</form>

</body>
</html>
