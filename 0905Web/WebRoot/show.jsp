<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	import="com.blog.friend.entity.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>全部好友信息</title>
</head>

<body>
<p align="center">
	<c:forEach items="${requestScope.cityList}" var="friend">
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

	</c:forEach>
	 <form name="myform" action="/0905Web/index.jsp"  method="get"> 
     <p align="center"><input type="submit" value="返回首页"></br>
	欢迎查询好友信息 查询数据后显示的内容
      <hr/>
</body>
</html>
