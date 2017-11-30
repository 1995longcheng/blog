<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加好友信息</title>
    
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
  <form name="myform" action="/0905Web/InerstYes.jsp"  method="get">
   <p align="center">请输入好友信息
     <p align="center">填写好友ID:<input type="text" name="fid"><br/>
     <p align="center"> 填写好友名字:<input type="text" name="fname"><br/>
     <p align="center">填写好友年龄:<input type="text" name="fage"><br/>
     <p align="center">填写好友性别:<input type="text" name="fsex"><br/>
  
  
  <p align="center"><input type="submit" value="确认提交">
  
     <br>
      <a href="../../blog/JM1.jsp">返回用户中心</a><br/>
  </body>
</html>
