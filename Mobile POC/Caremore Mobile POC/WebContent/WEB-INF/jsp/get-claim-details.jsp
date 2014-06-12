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
			<a href="<c:url value="/secure/welcome" />" data-icon="back" data-theme="b" class="ui-btn-left">back</a>
			<!-- <a href="../" data-icon="home" data-theme="b" class="ui-btn-right">Home</a>
			<a href="<c:url value="/j_spring_security_logout" />"
				data-icon="check" data-theme="b" class="ui-btn-left">Logout</a>-->
		</div>
		<!-- /header -->

		<div data-role="content">
				<form method="POST"
					action="<c:url value="/secure/claim-info-from-id" />" data-ajax="true">
					<input type="text" name="claim_id" id="claim_id" placeholder="Claim ID"/>
					<button id="login_submit" type="submit" data-theme="a">Submit</button>
				</form>		
		</div>
		<!-- /content -->

		<%@include file="footer.jsp" %>	
		<!-- /footer -->
	</div>
	<!-- /page -->

</body>
</html>