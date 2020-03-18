<%@ page contentType="text/html;charset=Windows-31J" %>
<html>
<head>
<title>確認画面</title>
</head>
<body>
<form method="POST" action="finish.jsp">
<h1>確認</h1>
名前（姓）：${requestScope['Name1']}<br>
名前（氏）：${requestScope['Name2']}<br>
誕生日：${requestScope['Birth']}<br>
メールアドレス：${requestScope['Address']}<br>
<input type="submit" value="登録">
</form>
<form method="POST" action="entry.jsp">
<input type="submit" value="戻る">
</form>
</body>
</html>