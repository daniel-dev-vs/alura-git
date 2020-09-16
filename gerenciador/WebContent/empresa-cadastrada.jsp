<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa cadastrada</title>
</head>
<body>
	<c:if test="${not empty empresa}">
		empresa <b>${ empresa }</b> cadastrada com sucesso.
	</c:if>
	
	<c:if test="${empty empresa}">
		nenhuma empresa cadastrada.
	</c:if>
</body>
</html>