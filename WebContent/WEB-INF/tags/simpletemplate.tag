<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="content" fragment="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title }</title>
</head>
<body>
	<a href="NewFile.jsp">Home</a>
	<a href="aboutus.jsp">About Us</a>
	<a href="news.jsp">News</a>
	
	<br/>
	
	<jsp:invoke fragment="content"></jsp:invoke>
	
	<br/>
	Copryght teste 2019	
</body>
</html>