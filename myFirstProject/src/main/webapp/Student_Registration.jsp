<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDEN_REGISTRATION</title>
</head>
	<h2>Student Registration Form</h2>
<body>
	
	<form action="Submit">
		 Student name: <input type = "text" name = "name" 	placeholder="Enter your name" /> <br><br>
         Email : <input type = "text" 	name = "email" 		placeholder="Enter your email"/> <br><br>
         Age   : <input type = "number" name = "age" 		value = "age" placeholder="Enter Age"><br><br>
         Phone : <input type = "number" name = "phone" 		placeholder="Enter contact"> <br><br>
         Degree: <input type = "radio" 	name = "Degree" 	value = "mca"> MCA
         		 <input type = "radio" 	name = "Degree" 	value = "bca"> BCA
         		 <input type = "radio" 	name = "Degree" 	value = "mtech"> MTech
         		 <input type = "radio" 	name = "Degree" 	value = "Btech"> BTech
         		 <input type = "radio" 	name = "Degree" 	value = "Other"> Other<br><br>
         		 <label>Gender:</label>
         		 <input type = "radio" 	name = "  " 		value = "male"> Male
         		 <input type = "radio" 	name = "  " 		value = "female"> Female
         		 <input type = "radio" 	name = "  " 		value = "other"> Other <br><br>	
         		 
         		 <input type = "submit" value="Submit">
    </form>
</body>
</html>