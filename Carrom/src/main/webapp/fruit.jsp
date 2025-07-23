<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Fruits Form</title>
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
            width: 380px;
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
    <h1>Fruits Form</h1>
    <form action="fruit">

        <input type="text" name="fruitName" placeholder="Fruit Name" required>
        <input type="text" name="fruitColor" placeholder="Fruit Color" required>
        <input type="number" name="weight" placeholder="Weight (in grams)" required>
        <input type="text" name="placeOfOrigin" placeholder="Place of Origin" required>
        <input type="text" name="shopKeeperName" placeholder="Shopkeeper Name" required>
        <input type="text" name="customerName" placeholder="Customer Name" required>
        <input type="number" name="price" placeholder="Price (in rupees)" required>
        <input type="text" name="presentInSeason" placeholder="Present in Season" required>
        <input type="number" name="noOfSeeds" placeholder="Number of Seeds" required>
        <input type="number" name="lifespan" placeholder="Lifespan (in days)" required>

        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>
