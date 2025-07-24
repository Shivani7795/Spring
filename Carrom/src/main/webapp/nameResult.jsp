<%@ page isELIgnored="false" %>
<html>
<body>
<h2>Name Details</h2>
<h2>First Name: ${NameDto.firstName}</h2>
<h2>Middle Name: ${NameDto.middleName}</h2>
<h2>Last Name: ${NameDto.lastName}</h2>
</body>
</html>

<!--<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Name Result</title>
    <style>
        body {
            background-color: #f3e8ff;
            font-family: Arial, sans-serif;
            padding: 50px;
            color: #4b2e83;
        }
        .result-box {
            background-color: #f9f0ff;
            padding: 30px;
            border-radius: 10px;
            width: 300px;
            margin: auto;
            text-align: center;
            box-shadow: 0 0 15px rgba(150, 100, 200, 0.2);
        }
        h2 {
            margin-bottom: 20px;
        }
        .name {
            font-size: 18px;
            margin: 10px 0;
        }
    </style>
</head>
<body>

<div class="result-box">
    <h2>Name Details</h2>
    <div class="name">First Name: ${firstName}</div>
    <div class="name">Middle Name: ${middleName}</div>
    <div class="name">Last Name: ${lastName}</div>
</div>


</body>
</html>
