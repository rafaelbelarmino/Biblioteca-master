<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ConsultaServ" method="post">
	<h1>Consulta de Volume</h1>
		<table cellspacing="10">
			<tr>
			<td><label for="tituloproc">Título: </label></td>
					<td align="left"><input type="text" name="tituloproc"></td>
			</tr>		
		</table>
	<br /> <input type="submit" value="Entrar"> <input type="reset"
			value="Limpar">
	</form>
</body>
</html>