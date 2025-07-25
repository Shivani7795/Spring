<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Ice-Cream</title>
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
      width: 300px;
      text-align: left;
    }

    .form-container h1 {
      color: #7e57c2;
      text-align: center;
      margin-bottom: 20px;
    }

    .form-container label {
      display: block;
      margin-top: 10px;
      margin-bottom: 5px;
      color: #5c4080;
      font-weight: bold;
    }

    .form-container input[type="text"],
    .form-container input[type="number"],
    .form-container select {
      width: 100%;
      padding: 10px;
      margin-bottom: 10px;
      border: 1px solid #d1b3ff;
      border-radius: 5px;
      box-sizing: border-box;
    }

    .form-container input[type="radio"] {
      margin-right: 5px;
    }

    .form-container .radio-group {
      display: flex;
      gap: 10px;
      align-items: center;
      margin-bottom: 10px;
    }

    .form-container input[type="submit"] {
      background-color: #a678d2;
      color: white;
      border: none;
      padding: 10px 20px;
      margin-top: 10px;
      border-radius: 5px;
      cursor: pointer;
      width: 100%;
    }

    .form-container input[type="submit"]:hover {
      background-color: #7e57c2;
    }
    </style>
</head>
<body>
<h1>${error}</h1>

<div class="form-container">
    <h1>Place Your Order</h1>
    <form action="order">

        <label for="name">Customer Name:</label>
        <input type="text" name="name" id="name" required>

        <label for="flavour">Flavour:</label>
        <select name="flavour" id="flavour" required>
            <option value="">--Select Flavour--</option>
            <option value="Vanilla">Vanilla</option>
            <option value="Chocolate">Chocolate</option>
            <option value="Strawberry">Strawberry</option>
            <option value="Mango">Mango</option>
            <option value="Butterscotch">Butterscotch</option>
            <option value="Black Current">Black Current</option>
        </select>

        <label for="quantity">Quantity:</label>
        <input type="number" name="quantity" id="quantity" required>

        <label>Take Away:</label>
        <div class="radio-group">
            <input type="radio" id="yes" name="takeAway" value="Yes" required>
            <label for="yes">Yes</label>

            <input type="radio" id="no" name="takeAway" value="No">
            <label for="no">No</label>
        </div>

        <label for="addons">Addons:</label>
        <select name="addons" id="addons">
            <option value="">-- Select Addon --</option>
            <option value="No Addons">No Addons</option>
            <option value="Choco Chips">Choco Chips</option>
            <option value="Nuts">Nuts</option>
            <option value="Sprinkles">Sprinkles</option>
            <option value="Nutella">Nutella</option>
            <option value="Brownie">Crumbled Brownie</option>
        </select>

        <label for="coupon">Coupon Code:</label>
        <input type="text" name="coupon" id="coupon">

        <br><br>
        <input type="submit" value="Submit Order">
    </form>
</div>



</body>
</html>


