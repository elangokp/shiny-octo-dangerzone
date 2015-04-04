<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>CareAnyWhere</title>
<%@include file="header-scripts.jsp" %>
</head>

<body>

	<div data-role="page">

		<div data-role="header">
			<h1>CareAnyWhere</h1>
			<!--<a href="<c:url value="/" />" data-icon="home" data-theme="b"
				class="ui-btn-right">Home</a> -->
		</div>
		<!-- /header -->

		<div data-role="content">
			<c:if test="${not empty error}">
				<div data-role="collapsible" data-mini="true">
					<h3>Login Failed</h3>
					<p>
						Your login attempt was not successful, try again.<br /> Caused :
						${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
					</p>
				</div>
			</c:if>
			<form method="POST"
				action="<c:url value='j_spring_security_check' />" data-ajax="true">
				<div data-role="fieldcontain" class="ui-hide-label">
					<label for="login_username">Username:</label> <input type="text"
						name="j_username" id="login_username" placeholder="Username"/>
				</div>
				<div data-role="fieldcontain" class="ui-hide-label">
					<label for="login_password">Password:</label> <input
						type="password" name="j_password" id="login_password" placeholder="Password"/>
				</div>
				<div data-role="fieldcontain" class="ui-hide-label">
					<button id="login_submit" type="submit" data-theme="a">Submit</button>
				</div>
			</form>
		</div>
		<!-- /content -->

		<%@include file="footer.jsp" %>	
		<!-- /footer -->
	</div>
	<!-- /page -->

</body>
</html>