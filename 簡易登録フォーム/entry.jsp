<%@ page contentType="text/html;charset=utf-8" %>
<html>
  <head>
    <title>登録画面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/entryStyle.css">
  </head>
  <body>
    <header>
      <h1>登録</h1>
    </header>
    <form method="POST" action="EntryServlet">
    <div class="EntryList">
      <ul class="ListName">
          名前（姓）<br>
          名前（氏）<br>
          誕生日<br>
          メールアドレス<br>
      </ul>
      <ul class="ListForm">
          ：<input type="text" name="Last_name" class="InputForm"><br>
          ：<input type="text" name="Full_name" class="InputForm"><br>
          ：<input type="text" name="Birthday" class="InputForm"><br>
          ：<input type="text" name="mail_Address" class="InputForm"><br>
      </ul>
    </div>
    <footer>
      <input type="submit" value="登録">
    </footer>
      </form>
  </body>
</html>