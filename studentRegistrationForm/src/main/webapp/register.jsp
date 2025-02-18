<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>

	<form action="register" method="post"	>
		<input type="text" name="name" placeholder="Name"><br><br>
		<input type="text" name="email" placeholder="Email"><br><br>
		<input type="password" name="pass" placeholder="Password" ><br><br>
		Gender:<input type="radio" name="gender1" value="male">Male
		<input type="radio" name="gender2" value="female">Female 
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
		<input type="submit"  value="Register">
		
	</form>

</body>
</html>