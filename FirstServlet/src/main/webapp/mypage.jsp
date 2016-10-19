<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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