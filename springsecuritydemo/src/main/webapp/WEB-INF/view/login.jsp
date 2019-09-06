<%--
  Created by IntelliJ IDEA.
  User: clement
  Date: 2019/9/4
  Time: 0:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<fieldset>
    <legend>欢迎登录</legend>
    <form name="login" action="/login" method="post">
   <label>账号：</label> <input type="text" name="username" />
        <br/>
   <label>密码：</label>  <input type="password" name="password"/>
        <br/>
        <input type="submit" value="登录">
    </form>
</fieldset>
</body>
</html>
