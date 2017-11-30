<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'denglu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <form id="form1" name="form1" method="post" action="yanzheng.jsp">
<table width="236" border="1" cellspacing="2" bordercolor="#000000" bgcolor="#0099FF">
<tr>
<td width="226"><label>账号：
<input type="text" name="username" />
</label></td>
</tr>
<tr>
<td><label>密码：
<input type="text" name="password" />
</label></td>
</tr>
<tr>
<td><input type="hidden" name="city" value="新疆" /></td>
</tr>
<tr>
<td><input type="submit" name="Submit" value="提交" /></td>
</tr>
</table>
</form>
  </body>
</html>
