<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>添加学生信息</h3>
		<hr>
		<form action="addstudent.action" method="post">
			姓名：<input type="text" name="student.name"><br>
			班级：<input type="text" name="student.dept"><br>
			<input type="submit" value="提交">
		</form>
	</center>	
</body>
</html>