<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="urlNovaEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<form action="${urlNovaEmpresa} " method="post">
		<p>ID da empresa:</p> <input type="text" name="id"/>
		<p>Nome empresa:</p> <input type="text" name="nome"/>
		<p>Data abertura:</p> <input type="text" name="data"/>
		<input type="submit"/>
	</form>
</body>
</html>