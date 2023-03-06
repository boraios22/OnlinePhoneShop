<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"></jsp:include>


<div class="container">
	<div align="center">
		<div>
			<h1>Administration</h1>
			<a href="list_users">Users</a>| <a href="list_phones">Phones</a>| <a
				href="list_phones">Customers</a>| <a href="list_phones">Brands</a>|
			<a href="list_phones">Orders</a>| <a href="list_phones">Reviews</a>|
			<br/>
			<br/>
		</div>
		
		
		<div>
			<h4><a href="${pageContext.request.contextPath}/admin/user_form">Create new User</a></h4>
			<table border="1px">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Actions</th>
				</tr>
				
				<c:forEach var="user" items="${users }">
				<tr>
					<td>${user.id}</td>
					<td>${user.fullName }</td>
					<td>${user.email }</td>
					<td><a href="">Edit</a>|<a href="">Delete</a></td>
				</tr>
				</c:forEach>
				
			</table>
		</div>
	</div>
</div>

