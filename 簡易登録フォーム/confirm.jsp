<%@ page contentType="text/html;charset=utf-8" %>
<html>
  <head>
    <title>確認画面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/entryStyle.css">
  </head>
  <body>
    <header>
      <h1>確認</h1>
    </header>
      <div class="EntryList">
        <ul class="ListName">
            名前（姓）<br>
            名前（氏）<br>
            誕生日<br>
            メールアドレス<br>
        </ul>
        <form method="POST" action="finish.jsp" class="ent">
        <ul class="ListForm">
            ：${requestScope['Name1']}<input type="hidden" name="HidName1" value=${requestScope['Name1']}><br>
            ：${requestScope['Name2']}<input type="hidden" name="HidName2" value=${requestScope['Name2']}><br>
            ：${requestScope['Birth']}<input type="hidden" name="HidBirth" value=${requestScope['Birth']}><br>
            ：${requestScope['Address']}<input type="hidden" name="HidAddress" value=${requestScope['Address']}><br>
        </ul>
      </div>
    <footer>
          <input type="submit" value="登録">
        
        <form method="POST" action="entry.jsp" class="ent">
          <input type="submit" value="戻る">
        </form>
    </footer>
  </body>
</html>