<%@ page contentType="text/html;charset=Windows-31J" %>
<html>
<head>
<title>�m�F���</title>
</head>
<body>
<form method="POST" action="finish.jsp">
<h1>�m�F</h1>
���O�i���j�F${requestScope['Name1']}<br>
���O�i���j�F${requestScope['Name2']}<br>
�a�����F${requestScope['Birth']}<br>
���[���A�h���X�F${requestScope['Address']}<br>
<input type="submit" value="�o�^">
</form>
<form method="POST" action="entry.jsp">
<input type="submit" value="�߂�">
</form>
</body>
</html>