<%@ page contentType="text/html;charset=Windows-31J" %>
<html>
<head>
<title>確認画面</title>
</head>
<body>
<form method="POST" action="finish.jsp">
<h1>確認</h1>
名前（姓）${requestScope['msg']}<br>
名前（氏）<% out.println(request.getParameter("Full_name")); %><br>
誕生日<% out.println(request.getParameter("Birthday")); %><br>
メールアドレス<% out.println(request.getParameter("mail_Address")); %><br>
<input type="submit" value="登録">
</body>
</html>