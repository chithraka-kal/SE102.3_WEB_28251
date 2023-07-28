<html>
    <body>
    <?php
    $servername = "localhost";
    $user = "root";
    $password = "";
    $db = "sample";

    $conn = mysqli_connet($servername, $user, $password, $db);

    if(!&conn){
        die("Connection failed: ".mysqli_connect_error());
    }
    $sql = "SELECT id, name, email FROM users";
    $result = $conn->query($sql);

    ?>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>Name</td>
            <th>Email</th>
        </tr>
        <?php
         if ($result->num_rows>0){
            while($row = $result->fetch_assoc()){ ?>
            <tr>
            <td><?php echo $row["id"]?></td>
            <td><?php echo $row["name"]?></td>
            <th><?php echo $row["email"]?></th>
        </tr>
            
        <?php } ?>
        
    </table>
 </html>       
