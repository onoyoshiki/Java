<%@ page contentType="text/html;charset=Windows-31J" %>
<html>
<head>
<title>�m�F���</title>
</head>
<body>
<form method="POST" action="finish.jsp">
<h1>�m�F</h1>
���O�i���j${requestScope['msg']}<br>
���O�i���j<% out.println(request.getParameter("Full_name")); %><br>
�a����<% out.println(request.getParameter("Birthday")); %><br>
���[���A�h���X<% out.println(request.getParameter("mail_Address")); %><br>
<input type="submit" value="�o�^">
</body>
</html>