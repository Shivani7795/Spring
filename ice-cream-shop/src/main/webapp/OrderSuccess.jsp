<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Order Confirmation</title>
    <style>
        body {
            background-color: #f3e8ff;
            font-family: Arial, sans-serif;
            margin: 0;
            height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }

        h2, h3 {
            color: #5c4080;
            margin: 8px 0;
        }

        h2 {
            font-size: 28px;
            color: #7e57c2;
        }

        .details-box {
            background-color: #f9f0ff;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 0 15px rgba(150, 100, 200, 0.2);
            width: 360px;
            text-align: left;
        }

        .success-message {
            color: green;
            font-weight: bold;
            text-align: center;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<div class="details-box">
    <div class="success-message">
        <h3>Order Placed Successfully!</h3>
    </div>
    <h2>Order Details</h2>
    <h3>Name: ${Ice_creamDto.name}</h3>
    <h3>Flavour: ${Ice_creamDto.flavour}</h3>
    <h3>Quantity: ${Ice_creamDto.quantity}</h3>
    <h3>Take Away: ${Ice_creamDto.takeAway}</h3>
    <h3>Addons: ${Ice_creamDto.addons}</h3>
    <h3>Coupon: ${Ice_creamDto.coupon}</h3>
    <h3>Total Bill:${total}</h3>
</div>
</body>
</html>
