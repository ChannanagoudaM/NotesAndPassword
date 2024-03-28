<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register for Notes</title>
</head>
<body>
<form action="create">
<h1>Enter Id : <input type="text" name="id"  placeholder="Typer Your id"></h1>
<h1>Enter Name : <input type="text" name="name" placeholder="Type Your Name"></h1>
<h1>Enter Password : <input type="password" name="password" placeholder="Enter Password"></h1>
<h1>Your Note : </h1>
<input type="text" name="notes" placeholder="Type Youre Notes">
<button type="submit">Submit</button>
</form>

<form action="delete">
<h1>Enter Id To Delete Your Account</h1>
<input type="text" name="id" placeholder="Enter Id">
<br><br>
<input type="submit">
</form>


<form action="get">
<h1>Enter Your Name To See Your Account Details</h1>
<input type="text" name="name">
<br><br>
<input type="submit">
</form>


<form action="modify">
<h1>To Modify Your Notes</h1>
<input type="text" name="password" placeholder="Enter Your Account Paaasword">
<br><br>
<input type="submit">

</form>


<form action="all">
<h1>To view All Members Accounts</h1>
<input type="submit" placeholder="Enter">
</form>

</body>
</html>