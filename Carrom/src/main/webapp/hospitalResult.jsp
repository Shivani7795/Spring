<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hospital Details</title>
</head>
<body>
<h2>Hospital Submission Details</h2>
<h3>Hospital Name: ${HospitalDto.hospitalName}</h3>
<h3>Doctor Name: ${HospitalDto.doctorName}</h3>
<h3>Number of Patients per Day: ${HospitalDto.noPatients}</h3>
<h3>Number of Wards: ${HospitalDto.noWard}</h3>
<h3>Number of Chairs: ${HospitalDto.noChairs}</h3>
<h3>Location: ${HospitalDto.location}</h3>
</body>
</html>
