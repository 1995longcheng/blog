<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>  
<base href="<%=basePath%>">
  <head>
    <title>查询好友信息</title>
  </head>
  
  <body>
 
  <p align="center">
  
 您查询的好友的信息为：
<table width="500" height="170"border="1" align="center">

  <tr>
    <td width="300">好友id： </td>
    <td width="300">${friend.fid }</td>
  </tr>
 
  <tr>
    <td>好友名字： </td>
    <td>${friend.fname }</td>
  </tr>
  <tr>
    <td>好友年龄 ：</td>
    <td>${friend.fage }</td>
  </tr>
  <tr>
    <td>好友性别 ：</td>
    <td>${friend.fsex }</td>
  </tr>
</table>

   
      <p align="center">
<a href="index.jsp">返回首页</a>
</table>
  </body>
</html>
