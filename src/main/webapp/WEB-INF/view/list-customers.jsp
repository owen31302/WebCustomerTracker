<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>

	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

<div id="wrapper">
	<div id="header">
		<h2>CRM - Customer Relationship Manager</h2>
	</div>
</div>

<div id="container">

	<div id="content">

		<!-- put new button: Add customer -->
		<input type="button" value="Add Customer"
			   onclick="window.location.href='showFormForAdd'; return false;"
			   class="add-button"
		/>

		<!--  add our html table here -->

		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Action</th>
			</tr>

			<!-- loop over and print our customers -->
			<c:forEach var="tempCustomer" items="${customers}">

				<!-- create update link with id in it -->
				<c:url var="updateLink" value="/customer/showFormForUpdate">
					<c:param name="customerId" value="${tempCustomer.id}" />
				</c:url>

				<c:url var="deleteLink" value="/customer/delete">
					<c:param name="customerId" value="${tempCustomer.id}" />
				</c:url>

				<!-- construct an "Update" link with customer id -->
				<tr>
					<td> ${tempCustomer.firstName} </td>
					<td> ${tempCustomer.lastName} </td>
					<td> ${tempCustomer.email} </td>
					<td>
						<a href="${updateLink}">Update</a>
						|
						<a href="${deleteLink}"
						onclick="if (!(confirm('Are you sure you want to delete this user?'))) return false">Delete</a>
					</td>
				</tr>

			</c:forEach>

		</table>

	</div>

</div>


</body>

</html>