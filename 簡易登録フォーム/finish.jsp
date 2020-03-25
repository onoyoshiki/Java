<%@ page contentType="text/html;charset=utf-8" %>
<html>
	<head>
		<title>完了画面</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/entryStyle.css">
	</head>
	<body>
		<header>
			<h1>完了</h1>
		</header>
		<footer>
			<form method="POST" action="entry.jsp">
				<input type="submit" value="TOPへ">
				<% 
					String[] items = {request.getParameter("HidName1"),
					request.getParameter("HidName2"),
					request.getParameter("HidBirth"),
					request.getParameter("HidAddress")};
					for(String item : items){
						if(item == null){
							response.sendRedirect("error.jsp");
							break;
						}
					}
				%>
			</form>
		</footer>
	</body>
</html>