<!DOCTYPE html>
<html>
<head>
    <title>Electricity Bill Calculator</title>
</head>
<body>
    <h1>Electricity Bill Calculator</h1>

    <form method="post" action="">
        Enter Units Consumed: <input type="number" name="units" required>
        <input type="submit" value="Calculate Bill">
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] === "POST") {
        $units = $_POST["units"];
        $totalBill = 0;

        if ($units > 0 && $units <= 50) {
            $totalBill = $units * 3.50;
        } elseif ($units > 50 && $units <= 100) {
            $totalBill = 50 * 3.50 + ($units - 50) * 4.00;
        } elseif ($units > 100 && $units <= 150) {
            $totalBill = 50 * 3.50 + 50 * 4.00 + ($units - 100) * 5.20;
        } elseif ($units > 150) {
            $totalBill = 50 * 3.50 + 50 * 4.00 + 50 * 5.20 + ($units - 150) * 6.50;
        }

        echo "<p>Total Bill: Rs. " . number_format($totalBill, 2) . "</p>";
    }
    ?>
</body>
</html>
