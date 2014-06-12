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
		<a href="<c:url value="/" />" data-icon="home" data-theme="b" class="ui-btn-right">Home</a>
	</div><!-- /header -->

	<div data-role="content">	
		${message}	
	</div><!-- /content -->

	<%@include file="footer.jsp" %>	
	<!-- /footer -->
</div><!-- /page -->

</body>
</html>