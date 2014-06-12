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
					action="<c:url value="/secure/eligibility-info" />" data-ajax="true">
					<input type="text" name="policy_number" id="policy_number" placeholder="Policy Number"/>
					<%-- 
					<select	name="relationship" data-native-menu="false">
						<option value="" data-placeholder="true">Choose a Relationship</option>
						<c:forEach var="aRelationship" items="${relationships}">
							<option value="${aRelationship.RelationshipCode}">${aRelationship.RelationshipDesc}</option>
						</c:forEach>
					</select>
					--%>
					<select	name="product_category" data-native-menu="false">
						<option value="" data-placeholder="true">Choose a Product Category</option>
						<c:forEach var="aProductCategory" items="${productCategories}">
							<option value="${aProductCategory.ProductCategoryCode}">${aProductCategory.ProductCategoryCode} - ${aProductCategory.ProductCategoryDesc}</option>
						</c:forEach>
					</select>
					<input type="text" name="date_of_service" id="date_of_service" placeholder="Tap to Select Date of Service" readonly/>
					<button id="login_submit" type="submit" data-theme="a">Submit</button>
				</form>		
				<script>
					$(function(){
					    $('#date_of_service').scroller({
					        preset: 'date',
					        theme: 'default',
					        display: 'bubble',
					        mode: 'scroller',
					        animate: 'fade',
					        dateFormat: 'dd MM yy',
					        dateOrder: 'mm dd yy',
					        endYear: '2199',
					        startYear: '1753'
					    });    
				
					    $('#date_of_service').click(function(){
					        $('#date_of_service').scroller('show'); 
					        return false;
					    });
					});
				</script>	
		</div>
		<!-- /content -->

		<%@include file="footer.jsp" %>	
		<!-- /footer -->
	</div>
	<!-- /page -->

</body>
</html>