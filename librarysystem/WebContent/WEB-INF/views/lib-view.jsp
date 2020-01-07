<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library</title>
</head>
<body>
	<h1>Library</h1>
	
	<table border=1>
		<tr>
			<th>TITLE</th>
			<th>AUTHOR</th>
			<th>YEAR</th>
		</tr>
		
		<c:forEach var="books" items="${bookList}">
			<tr>
				<td><c:out value="${books.title}"></c:out></td>
				<td><c:out value="${books.author}"></c:out></td>
				<td><c:out value="${books.year}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>