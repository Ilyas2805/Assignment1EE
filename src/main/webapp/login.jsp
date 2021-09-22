<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <h1>Welcome!</h1>
    <form method="post" action="/main-servlet">
        <input type="text" name="username" placeholder="Username">
        <input type="number" name="id" placeholder="ID">
        <input type="submit" value="Send">
    </form>

    <h1>Search by id</h1>
    <form method="get" action="/main-servlet">
        <input type="number" name="id" placeholder="ID">
        <input type="submit" value="Search">
    </form>

</body>
</html>
