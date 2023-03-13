<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Online Phone Shop</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
<header>
 <nav class="navbar navbar-expand-md navbar-dark"
  style="background-color: #2596be;">
  <div>
   <a href="<%= request.getContextPath() %>/home.jps" class="navbar-brand"> Online Phone Shop</a>
  </div>

  <ul class="navbar-nav navbar-collapse justify-content-end">
	<li><a href="<%= request.getContextPath() %>/home.jps" class="nav-link">Logout</a></li>
  </ul>
 </nav>
</header>
		<div align="center">
			<h1>Welcome to Online Phone Shop</h1>
			<a href="<%= request.getContextPath() %>/customer/list_users">iPhone</a>| <a href="list_phones">Samsung</a>| <a
				href="<%= request.getContextPath() %>/customer/list_phones">Huawei</a>| <a href="list_phones">Oppo</a>|
			<a href="<%= request.getContextPath() %>/customer/list_phones">Popular</a>| <a href="list_phones">New Arrivals</a>|
			<br/>
			<br/>
		</div>