<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户登录</title>
</head>

<body>
    <form action="http://localhost:8080/offer100/loginController/login" method="post" id="myform">
        <input type="text" id="userName" name="username"/>
        <input type="password" id="userPassword" name="password"/>
        <input type="submit" value="提交" id="login" />
    </form>
</body>

</html>