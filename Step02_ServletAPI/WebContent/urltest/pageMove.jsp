<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>pageMove.html</title>
</head>
<body>
  <a href="../fa">fail로 page 이동</a>
  <a href="<%=request.getContextPath()%>/fa">fail로 page 이동</a>
  <a href="http://localhost:8080/Step02_ServletAPI/fa">fail로 page 이동</a>
  <a href="http://www.naver.com">fail로 page 이동</a>
</body>
</html>