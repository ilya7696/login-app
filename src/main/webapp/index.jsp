<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <form method="post" action="authentication">
        <label for="login">login</label>
        <input name="login" id="login" type="text" placeholder="введите логин"/>

        <label for="password">password</label>
        <input name="password" id="password" type="text" placeholder="введите пароль"/>

        <input type="submit"/>
    </form>
</body>
</html>