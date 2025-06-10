<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Hotel Bea</title>
<link rel="stylesheet" href="styles/style_GENERAL.css">
<link rel="stylesheet" href="styles/style_CONCRETO.css">
<link rel="stylesheet" href="styles/acerca.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

</head>
<body>

	<%@ include file="includes/cabecera.jsp"%>
	<%@ include file="includes/menu.jsp"%>

	<main>
		<section class="about-hotel">
			<h1>Conócenos - Hotel Bea</h1>
			<p>Bienvenido al Hotel Bea, tu hogar lejos de casa. Situado en un
				entorno privilegiado, ofrecemos un espacio acogedor, moderno y
				cómodo para que disfrutes de una estancia inolvidable. Nuestro
				compromiso es brindarte un servicio excelente y todas las
				comodidades para que te sientas como en casa.</p>
			<p>Contamos con habitaciones amplias y luminosas, servicios
				exclusivos y un equipo profesional dispuesto a ayudarte en todo
				momento. ¡Ven y descubre por qué Hotel Bea es la mejor opción para
				tu próxima visita!</p>
			<div class="services-icons">
				<div>
					<i class="fas fa-wifi fa-2x"></i>
					<p>Wi-Fi gratuito</p>
				</div>
				<div>
					<i class="fas fa-swimming-pool fa-2x"></i>
					<p>Piscina</p>
				</div>
				<div>
					<i class="fas fa-concierge-bell fa-2x"></i>
					<p>Servicio 24 horas</p>
				</div>
				<div>
					<i class="fas fa-utensils fa-2x"></i>
					<p>Restaurante</p>
				</div>
			</div>
		</section>
	</main>

	<%@ include file="includes/pie.jsp"%>

</body>
</html>
