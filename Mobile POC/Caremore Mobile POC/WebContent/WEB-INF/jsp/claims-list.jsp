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
			<a href="<c:url value="/secure/search-claims" />" data-icon="back" data-theme="b" class="ui-btn-left">back</a>
			<!-- <a href="../" data-icon="home" data-theme="b" class="ui-btn-right">Home</a>
			<a href="<c:url value="/j_spring_security_logout" />"
				data-icon="check" data-theme="b" class="ui-btn-left">Logout</a> -->
		</div>
		<!-- /header -->

		<div data-role="content">
			<c:if test="${not empty claims}">
				<ul data-role="listview" data-inset="true">
		            <li data-role="list-divider"></li> 
		            <c:forEach var="aClaim" items="${claims}">
		            <li><a href="<c:url value="/secure/claim-info-from-list" />?claim_id=${aClaim.claimId}">${aClaim.claimId} - ${aClaim.status}</a></li>
		            </c:forEach>
	        	</ul>	
	        					
			</c:if>
			<c:if test="${empty claims}">
				No Claims found.
			</c:if>
		</div>
		<!-- /content -->

		<%@include file="footer.jsp" %>	
		<!-- /footer -->
	</div>
	<!-- /page -->

</body>
</html>