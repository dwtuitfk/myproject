<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Students</title>
</head>
<body>
<table border="1">
<tr>
<td>学号</td><td>姓名</td>
<td>年龄</td><td>性别</td>
<td>生日</td><td>地址</td>
<td>电话</td><td>状态</td>
<td>操作</td>
</tr>
 <s:iterator value="#list" status="bcs">
<tr>
<td><s:property value="xh"></s:property></td>
<td><s:property value="name"></s:property></td>
<td><s:property value="age"></s:property></td>
<td><s:property value="sex"></s:property></td>
<td><s:date name="birthday" format="yyyy年MM月dd日"></s:date></td>
<td><s:property value="address"></s:property></td>
<td><s:property value="tel"></s:property></td>
<td><s:property value="state"></s:property></td>
<td><input type="button" value="修改" ><input type="button" value="删除"></td>
</tr>
  </s:iterator>
</table>
<br>
</body>
</html>