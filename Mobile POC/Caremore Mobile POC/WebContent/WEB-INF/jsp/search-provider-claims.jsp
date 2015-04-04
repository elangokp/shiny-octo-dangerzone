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
					action="<c:url value="/secure/provider-claims-list" />" data-ajax="true">
					<input type="text" name="provider_npi" id="provider_npi" placeholder="Provider NPI"/>
					<input type="text" name="from_date" id="from_date" placeholder="From Service Date (Tap)" readonly/>
					<input type="text" name="till_date" id="till_date" placeholder="Till Service Date (Tap)" readonly/>
					<button id="login_submit" type="submit" data-theme="a">Submit</button>
				</form>		
				<script>
					$(function(){
					    $('#from_date').scroller({
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
				
					    $('#from_date').click(function(){
					        $('#from_date').scroller('show'); 
					        return false;
					    });

					    $('#till_date').scroller({
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
				
					    $('#till_date').click(function(){
					        $('#till_date').scroller('show'); 
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