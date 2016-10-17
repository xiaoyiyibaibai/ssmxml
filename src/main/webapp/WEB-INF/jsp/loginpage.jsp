<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	System.out.println(basePath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<link rel="stylesheet" href="<%=basePath%>css/jquery-ui.css" />
<script type="text/javascript" src="<%=basePath%>js/jquery-3.1.1.min.js" />
<script type="text/javascript" src="<%=basePath%>js/jquery-ui.min.js" />
</head>
<body>

	<h1>登录页面，输入登录信息。</h1>

	<div id="login-error">${error}</div>

	<form action="<%=basePath%>auth/loginAction"
		method="post">

		<p>
			<label for="userName">userName</label> <input id="userName"
				name="userName" type="text" />
		</p>

		<p>
			<label for="password">password</label> <input id="password"
				name="password" type="password" />
		</p>

		<p>
			<label for="date">date</label><input type="text" name="date"
			id="date" />
		</p>

		<input type="submit" value="Login" /> 

	</form>
	<script type="text/javascript">
		$("#date").datepicker();
	</script>
</body>
</html>
