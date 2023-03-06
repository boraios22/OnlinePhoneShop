<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"></jsp:include>


<div class="container">
	<div align="center">
		<div>
			<h4>Update user information</h4>
			<form action="${pageContext.request.contextPath}/admin/update_user" method="post">
				<table>
					<tr>
					<td align="right">Email:</td><td><input type="text" name="email" value="${user.email }"/></td>				
					</tr>
					<tr>
					<td align="right">Full name:</td><td><input type="text" name="fullName" value="${user.fullName }"/></td>				
					</tr>
					<tr>
					<td align="right">Password:</td><td><input type="text" name="password" value="${user.password }"/></td>				
					</tr>
					<tr>
					<td>
					<input type="hidden" name="id" value="${user.id }"/>
					</td>
					</tr>
					<tr>
					<td colspan="2" align="right"><input type="submit" value="Submit"/></td>
					</tr>
				
				</table>
			</form>
			
		</div>
	</div>
</div>
