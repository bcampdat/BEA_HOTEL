<%@page import="java.util.ArrayList"%>
<%@page import="com.ipartek.modelo.I_Constantes"%>
<%@page import="java.util.List"%>
<%@page import="com.ipartek.modelo.Habitacion"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
List<Habitacion> listaHabitaciones = new ArrayList();
if (request.getAttribute(I_Constantes.ATR_LISTA_HAB) != null) {
	listaHabitaciones = (List<Habitacion>) request.getAttribute(I_Constantes.ATR_LISTA_HAB);
}
System.out.println(listaHabitaciones);
%>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Habitaciones</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
<link rel="stylesheet" href="styles/styleCONCRETO.css">
<link rel="stylesheet" href="styles/styleGENERAL.css">
<link rel="stylesheet" href="styles/Tabla.css">
</head>
<body>

	<%@include file="includes/cabecera.jsp"%>
	<%@include file="includes/menu.jsp"%>

	<main>
		<section>

			<h2>Lista de Habitaciones</h2>
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Número</th>
						<th>Metros²</th>
						<th>Precio</th>
						<th>Nº Camas</th>
						<th>Exterior</th>
						
					</tr>
				</thead>
				<tbody>
					<%
					for (Habitacion elem : listaHabitaciones) {
					%>
					<tr>
						<td><%=elem.getId()%></td>
						<td><%=elem.getNum_hab()%></td>
						<td><%=elem.getM_cuadrados()%></td>
						<td><%=elem.getPrecio()%></td>
						<td><%=elem.getNum_camas()%></td>
						<td><%=elem.isExterior() ? "Sí" : "No"%></td>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
		</section>
	</main>

	<%@include file="includes/pie.jsp"%>

</body>
</html>
