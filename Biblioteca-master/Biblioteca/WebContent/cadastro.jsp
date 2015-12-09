<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Cadastro de Volume</h1>
	<form action="CadastroServ" method="post">
		<fieldset>
			<legend>Cadastro</legend>
			<table cellspacing="10">
				<tr>
					<td><label for="titulo">Título: </label></td>
					<td align="left"><input type="text" name="titulo"></td>
				</tr>
				<tr>
					<td><label for="autor">Autor: </label></td>
					<td align="left"><input type="text" name="autor"></td>
				</tr>
				<tr>
					<td><label for="editora">Editora: </label></td>
					<td align="left"><input type="text" name="editora"></td>
				</tr>
				<tr>
					<td><label for="anodepublicacao">Ano de publicação: </label></td>
					<td align="left"><input type="text" name="anodepublicacao"></td>

					<td><label for="numerodepaginas">Numero de páginas: </label></td>
					<td align="left"><input type="text" name="numerodepaginas"></td>
				</tr>
				<tr>
					<td><label for="tipodovolume">Tipo do Volume: </label></td>
					<td align="left"><select name="tipodovolume">
							<option value="livros">Livros</option>
							<option value="periodicos">Periódicos</option>
							<option value="fotografias">Fotografias</option>
							<option value="audios">Áudios</option>
					</select>
				<tr>
				<td><label for="descricao">Descrição: </label></td>
					<td align="left"><textarea name="comentário" rows="9" cols="40"></textarea></td>
				</tr>
			</table>

		</fieldset>
		<br><input type="submit" value="Cadastrar"> <input type="reset"
			value="Limpar">
	</form>

</body>
</html>