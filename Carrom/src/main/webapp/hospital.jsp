<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hospital Form</title>
    <style>
        body {
            background-color: #f3e8ff;
            font-family: Arial, sans-serif;
            margin: 0;
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .form-container {
            background-color: #f9f0ff;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 0 15px rgba(150, 100, 200, 0.2);
            width: 350px;
            text-align: center;
        }
        .form-container h1 {
            color: #7e57c2;
            margin-bottom: 20px;
        }
        .form-container input[type="text"],
        .form-container input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #d1b3ff;
            border-radius: 5px;
            box-sizing: border-box;
        }
        .form-container input[type="submit"] {
            background-color: #a678d2;
            color: white;
            border: none;
            padding: 10px 20px;
            margin-top: 10px;
            border-radius: 5px;
            cursor: pointer;
        }
        .form-container input[type="submit"]:hover {
            background-color: #7e57c2;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h1>Hospital Form</h1>
    <form action="hospital">
        <input type="text" name="hospitalName" placeholder="Hospital Name" required>
        <input type="text" name="doctorName" placeholder="Doctor Name" required>
        <input type="number" name="noPatients" placeholder="Number of Patients per day" required>
        <input type="number" name="noWard" placeholder="Number of Wards" required>
        <input type="number" name="noChairs" placeholder="Number of Chairs" required>
        <input type="text" name="location" placeholder="Location" required>
        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>
