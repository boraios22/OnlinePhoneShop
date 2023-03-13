<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"></jsp:include>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<div class="container">
	<div align="center">
		<div>
			<c:if test="${MESSAGE != null }">
				<p style="color:red">${MESSAGE }</p>
			</c:if>
		</div>
		<div>
			<h4>Enter user information</h4>
			<form:form action="${pageContext.request.contextPath}/admin/create_user" method="post">
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
					<td colspan="2" align="right"><input type="submit" value="Submit"/></td>
					</tr>
				
				</table>
			</form:form>
			
		</div>
	</div>
</div>

