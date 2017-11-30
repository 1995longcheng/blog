<%@ page language="java" errorPage="error.jsp" import="java.util.*" pageEncoding="UTF-8"%>

<html>
<title>好友信息系统</title>

<body>
<p align="center"><a href="show.jsp">显示所有的好友信息</a>
 <hr/> 
<p align="center">查询单个好友信息
  <form name="myform" action="/0905Web/showOne.jsp"  method="get">
  <p align="center">请输入好友ID
  <p align="center"><input type="text" name="fid"><br/>
  <p align="center"><input type="submit" value="提交查询">
  </form>
   <hr/>
   <center>
    <a href="Inerst.jsp">添加好友</a><br/>
  <a href="../../blog/JM1.jsp">返回用户中心</a><br/>
  
   </center>
</body>

</html>