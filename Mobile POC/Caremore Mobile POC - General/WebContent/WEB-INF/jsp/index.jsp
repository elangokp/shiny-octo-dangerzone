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
	</div><!-- /header -->

	<div data-role="content">	
		<ul data-role="listview" data-inset="true">
            <li data-role="list-divider"></li>            
            <li><a href="<c:url value="/hello" />">Hello World</a></li>
            <li><a href="<c:url value="/login" />">Login</a></li>
        </ul>	
	</div><!-- /content -->

	<%@include file="footer.jsp" %>	
	<!-- /footer -->
</div><!-- /page -->

</body>
</html>