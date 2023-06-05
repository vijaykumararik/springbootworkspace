<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        h1{
            color: green;
        }
    </style>
</head>
<body>
    <div class="addemp">
        <h1>Add Employee Details below</h1>
        <form action="addemp.jsp">
            <input type="text" placeholder="Enter employee name" name="name">
            <input type="tel" placeholder="Enter phone number" name="Phno">
            <input type="text" placeholder="Enter email" name="email">
            <input type="text" placeholder="Enter age" name="age">
            <input type="text" placeholder="Enter salary" name="sal">
            <input type="submit" value="Add Employee">
           
        </form> 
        <h1>${message}</h1>
    </div>
    
</body>
</html>