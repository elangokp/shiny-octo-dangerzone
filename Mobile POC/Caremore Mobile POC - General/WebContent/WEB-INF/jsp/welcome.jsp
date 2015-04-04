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
		<!-- <a href="<c:url value="/" />" data-icon="home" data-theme="b" class="ui-btn-right">Home</a>
		<a href="<c:url value="/j_spring_security_logout" />" data-icon="check" data-theme="b" class="ui-btn-left">Logout</a> -->
	</div><!-- /header -->

	<div data-role="content">	
				<div data-role="collapsible" data-mini="true">
					<h3>Welcome ${username}</h3>
					<p>
						You can do the following
					</p>
				</div>
		<ul data-role="listview" data-inset="true">
            <li data-role="list-divider"></li>            
            <li><a href="<c:url value="/secure/get-eligibility" />">Check Member Eligibility</a></li>
            <li><a href="<c:url value="/secure/search-claims" />">Search Claims</a></li>
            <!-- <li><a href="<c:url value="/secure/search-provider-claims" />">Search Provider Claims</a></li>
            <li><a href="<c:url value="/secure/search-member-claims" />">Search Member Claims</a></li>-->
            <li><a href="<c:url value="/secure/get-claim-details" />">Get Claim Details</a></li>
            <li><a href="<c:url value="/j_spring_security_logout" />">Logout</a></li>
        </ul>	
	</div><!-- /content -->

	<%@include file="footer.jsp" %>	
	<!-- /footer -->
</div>
<!-- /page -->

</body>
</html>