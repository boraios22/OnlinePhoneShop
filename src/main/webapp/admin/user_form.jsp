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
			<h4>Enter user information</h4>
			<form action="${pageContext.request.contextPath}/admin/create_user" method="post">
				<table>
					<tr>
					<td align="right">Email:</td><td><input type="text" name="email"/></td>				
					</tr>
					<tr>
					<td align="right">Full name:</td><td><input type="text" name="fullName"/></td>				
					</tr>
					<tr>
					<td align="right">Password:</td><td><input type="text" name="password"/></td>				
					</tr>
					<tr>
					<td colspan="2" align="right"><input type="submit" value="Submit"/></td>
					</tr>
				
				</table>
			</form>
			
		</div>
	</div>
</div>

