<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<form action="LoginServ" method="post">
		<fieldset>
			<legend>Login</legend>
			<table cellspacing="10">
				<tr>
					<td><label for="usuario">Usu�rio: </label></td>
					<td align="left"><input type="text" name="usuario"></td>
				</tr>
				<tr>
					<td><label for="senha">Senha: </label></td>
					<td align="left"><input type="password" name="senha"></td>
				</tr>
			</table>
		</fieldset>
		<br /> <input type="submit" value="Entrar"> <input type="reset"
			value="Limpar">
	</form>
</body>
</html>