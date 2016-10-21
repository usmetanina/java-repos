<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Шифорвка и дешифровка</title>
</head>
<body>
<h1>Шифровка и дешифровка</h1>

<form action="http://localhost:8080/encoder" method="post">
    <p>Введите текст для зашифровки:</p>
    <input type="text" name="src"/>
    <input type="submit" value="Зашифровать"/>
</form>

<form action="http://localhost:8080/decoder" method="post">
    <p>Введите текст для расшифровки:</p>
    <input type="text" name="src"/>
    <input type="submit" value="Расшифровать"/>
</form>

<p>${result}</p>
</body>
</html>