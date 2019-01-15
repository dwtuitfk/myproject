<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="addstudents.do">
  <p>学号：
    <input type="text" name="xh" id="xh">
  </p>
  <p>姓名：
    <input type="text" name="name" id="name">
  </p>
  <p>年龄：
	<input type="text" name="age" id="age">
  </p>
  <p>性别：
	<input type="text" name="sex" id="sex">
  </p>
  <p>生日：
    <input type="date" name="birthday" id="date">
  </p>
  <p>地址：
	<input type="text" name="address" id="address">
  </p>
  <p>电话：
    <input type="text" name="tel" id="tel">
  </p>
  <p>状态：
	<select name="state">
	<option value="1">在读</option>
	<option value="0">休学</option>
	</select>
  </p>
  <p>年级：
	<input type="text" name="gid" id="gid">
  </p>
  <p>
    <input type="submit" name="submit" id="submit" value="添加">
    <input type="reset"  name="reset" id="reset" value="重置">
  </p>
</form>
</body>
</html>