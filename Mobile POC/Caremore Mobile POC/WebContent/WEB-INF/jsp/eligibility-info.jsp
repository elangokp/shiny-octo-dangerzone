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
			<a href="<c:url value="/secure/get-eligibility" />" data-icon="back" data-theme="b" class="ui-btn-left">back</a>
			<!-- <a href="../" data-icon="home" data-theme="b" class="ui-btn-right">Home</a>
			<a href="<c:url value="/j_spring_security_logout" />"
				data-icon="check" data-theme="b" class="ui-btn-left">Logout</a> -->
		</div>
		<!-- /header -->

		<div data-role="content">
			<c:if test="${not empty eligibilityInfo}">
				<div data-role="collapsible-set">

					<div data-role="collapsible" data-collapsed="false">
					
					<h3>Policy Details</h3>
					<ul data-role="listview" data-inset="false">
					<li>Policy No: ${eligibilityInfo[0].PolicyNumber}</li>
					<li>Status: ${eligibilityInfo[0].PolicyStatus}</li>
					<li>Effective Date:	${eligibilityInfo[0].PolicyEffectiveDate}</li>
					<li>Termination Date:	${eligibilityInfo[0].PolicyTerminationDate}</li>
					<li>Covered Members: ${eligibilityInfo[0].CoveredMembers}</li>
					</ul>
					</div>
					
					<div data-role="collapsible">
					<h3>Member Details</h3>
					<ul data-role="listview" data-inset="false">
					<li>Name: ${eligibilityInfo[0].PolicyHolderName}</li>
					<li>Gender: ${eligibilityInfo[0].Gender}</li>
					<li>Date of Birth: ${eligibilityInfo[0].DateofBirth}</li>
					<li>Relationship: ${eligibilityInfo[0].Relationship}</li>
					</ul>
					</div>
					
					<div data-role="collapsible">
					<h3>Plan Details</h3>
					<ul data-role="listview" data-inset="false">
					<li>Plan: ${eligibilityInfo[0].PlanDesc}</li>
					<li>Product: ${eligibilityInfo[0].ProductDesc}</li>
					<li>Subgroup: ${eligibilityInfo[0].SubgroupName}</li>
					</ul>
					</div>
					
				</div>

				<!-- 
					<div class="ui-grid-a">
						<div class="ui-block-a">
							<ul data-role="listview">
								<li data-role="list-divider"></li>
								<li>PolicyNumber: ${anEligibilityInfo.PolicyNumber}</li>
								<li>PolicyHolderName: ${anEligibilityInfo.PolicyHolderName}</li>
								<li>PolicyStatus: ${anEligibilityInfo.PolicyStatus}</li>
								<li>PolicyEffectiveDate: ${anEligibilityInfo.PolicyEffectiveDate}</li>
								<li>Relationship: ${anEligibilityInfo.Relationship}</li>
								<li>Gender: ${anEligibilityInfo.Gender}</li>
								<li>DateofBirth: ${anEligibilityInfo.DateofBirth}</li>
								<li>PCP: ${anEligibilityInfo.PCP}</li>
							</ul>
						</div>
						<div class="ui-block-b">
							<ul data-role="listview">
								<li data-role="list-divider"></li>
								<li>${anEligibilityInfo.PolicyNumber}</li>
								<li>${anEligibilityInfo.PolicyHolderName}</li>
								<li>${anEligibilityInfo.PolicyStatus}</li>
								<li>${anEligibilityInfo.PolicyEffectiveDate}</li>
								<li>${anEligibilityInfo.Relationship}</li>
								<li>${anEligibilityInfo.Gender}</li>
								<li>${anEligibilityInfo.DateofBirth}</li>
								<li>${anEligibilityInfo.PCP}</li>
							</ul>
						</div>
					</div>
					 -->

				
			</c:if>
			<c:if test="${empty eligibilityInfo}">
				No Active member found for given member ID, date of service and product category.
			</c:if>
		</div>
		<!-- /content -->

		<%@include file="footer.jsp" %>	
		<!-- /footer -->
	</div>
	<!-- /page -->

</body>
</html>