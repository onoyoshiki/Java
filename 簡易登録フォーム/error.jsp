<%@ page contentType="text/html;charset=utf-8" %>
<html>
  <head>
    <title>エラー画面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/entryStyle.css">
  </head>
  <body>
    <header>
      <h1>エラー</h1>
    </header>
    <div class="errmsg">
      ${requestScope['errmsg']}
    </div>
    <footer>
      <form method="POST" action="entry.jsp">
        <input type="submit" value="戻る">
      </form>
    </footer>
  </body>
</html>