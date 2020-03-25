<%@ page contentType="text/html;charset=Windows-31J" %>
<html>
<head>
<title>登録画面</title>
</head>
<body>
<form method="POST" action="EntryServlet">
<h1>登録</h1>
名前（姓）<input type="text" name="Last_name"><br>
名前（氏）<input type="text" name="Full_name"><br>
誕生日<input type="text" name="Birthday"><br>
メールアドレス<input type="text" name="mail_Address"><br>
<input type="submit" value="登録">
</body>
</html>