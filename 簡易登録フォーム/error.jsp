<%@ page contentType="text/html;charset=Windows-31J" %>
<html>
<head>
<title>エラー画面</title>
</head>
<body>
<form method="POST" action="entry.jsp">
<h1>エラー</h1>
${requestScope['errmsg']}
<input type="submit" value="戻る">
</form>
</body>
</html>