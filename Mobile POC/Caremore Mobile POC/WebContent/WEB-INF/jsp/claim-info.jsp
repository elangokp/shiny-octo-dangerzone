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
			<c:if test="${referer eq 'get-claim-details'}">
				<a href="<c:url value="/secure/get-claim-details" />" data-direction="reverse" data-icon="back" data-theme="b" class="ui-btn-left">back</a>
			</c:if>
			<c:if test="${referer eq 'search-claims'}">
				<a href="<c:url value="/secure/search-claims" />" data-direction="reverse" data-icon="back" data-theme="b" class="ui-btn-left">back</a>
			</c:if>
			<!-- <a href="../" data-icon="home" data-theme="b" class="ui-btn-right">Home</a>
			<a href="<c:url value="/j_spring_security_logout" />"
				data-icon="check" data-theme="b" class="ui-btn-left">Logout</a> -->
		</div>
		<!-- /header -->

		<div data-role="content">
			<c:if test="${not empty claimDetails}">
				<div data-role="collapsible-set">

					<div data-role="collapsible" data-collapsed="false">
					
					<h3>Claim Details</h3>
					<ul data-role="listview" data-inset="false">
					<li>Claim No: ${claimDetails[0].claimId}</li>
					<li>Status: ${claimDetails[0].status}</li>
					<li>Low Service Date:	${claimDetails[0].lowServiceDate}</li>
					<li>High Service Date:	${claimDetails[0].highServiceDate}</li>
					<li>Received Date:	${claimDetails[0].receivedDate}</li>
					<li>Paid Date:	${claimDetails[0].paidDate}</li>
					<li>Total Charge:	$${claimDetails[0].totalCharge}</li>
					<li>Total Payable:	$${claimDetails[0].totalPayable}</li>
					<li>Paid Amount:	$${claimDetails[0].paidAmount}</li>
					</ul>
					</div>
					
					<div data-role="collapsible">
					<h3>Member Details</h3>
					<ul data-role="listview" data-inset="false">
					<li>Policy Number: ${claimDetails[0].policyNumber}</li>
					<li>Name: ${claimDetails[0].PolicyHolderName}</li>
					<li>Gender: ${claimDetails[0].Gender}</li>
					</ul>
					</div>
					
					<div data-role="collapsible">
					<h3>Provider Details</h3>
					<ul data-role="listview" data-inset="false">
					<li>Provider Name: ${claimDetails[0].providerName}</li>
					<li>NPI: ${claimDetails[0].npi}</li>
					</ul>
					</div>
					
				</div>
				
			</c:if>
			<c:if test="${empty claimDetails}">
				No Claim found.
			</c:if>
		</div>
		<!-- /content -->

		<%@include file="footer.jsp" %>	
		<!-- /footer -->
	</div>
	<!-- /page -->

</body>
</html>