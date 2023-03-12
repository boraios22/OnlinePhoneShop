<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Administration</title>
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
			<h1>Administration</h1>
			<a href="<%= request.getContextPath() %>/admin/list_users">Users</a>| <a href="list_phones">Phones</a>| <a
				href="<%= request.getContextPath() %>/admin/list_phones">Customers</a>| <a href="list_phones">Brands</a>|
			<a href="<%= request.getContextPath() %>/admin/list_phones">Orders</a>| <a href="list_phones">Reviews</a>|
			<br/>
			<br/>
		</div>