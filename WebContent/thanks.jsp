<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Group 11 - Chapter 2 Exercises</title>
        <link rel="stylesheet" href="./style.css">
    </head>
    <body>
        <h1>Thanks for joining our email lists</h1>
        
        <p>Here is information that you entered</p>
        
        <label>Email:</label>
        <span>${user.email}</span><br>
        <label>First Name:</label>
        <span>${user.firstName}</span><br>
        <label>Last Name:</label>
        <span>${user.lastName}</span><br><!-- comment -->
  
        <p>To enter another email address, click on the Back button in your browser or the Return button shown below
        <form action="" method ="get" >
            <input type="hidden" name="action" value="join">
            <input type="submit"  value="Return">
        </form>
    </body>
</html>
