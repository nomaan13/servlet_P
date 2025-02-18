<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>
	<form action="register" method="post">
		<input type="text" placeholder ="Name" name="name" ><br><br>
		<input type="text" placeholder ="Email" name="email" ><br><br>
		<input type="password" placeholder ="Password" name="password" ><br><br>
		Gender: <input type="radio" name="gender1" value="male">Male
				<input type="radio" name="gender1" value="female">Female
				<br><br>
		<select name="city">
			<option>Select City</option>
			<option>Delhi/Ncr</option>
			<option>Pune</option>
			<option>Bangalore</option>
			<option>Chennai</option>
			<option>Mumbai</option>
			<option>Hyderabad</option>
			<option>Coimbatore</option>
			<option>Kolkata</option>
		</select>	
		<br><br>
		
		<input type="submit" value="Register">
	</form>

</body>
</html>