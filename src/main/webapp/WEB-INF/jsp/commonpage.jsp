<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Insert title here</title>  
</head> 
<% 
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 %> 
<body>  
    <h1>Common Page</h1>  
    <p>每个人都能访问的页面.</p>  
    <a href="<%=basePath%>/main/admin"> Go AdminPage </a>  
    <br />  
    <a href="<%=basePath%>/auth/login">退出登录</a>  
  
</body>  
</html>  