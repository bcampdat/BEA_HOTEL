<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Servicios - Hotel Bea</title>
    <link rel="stylesheet" href="styles/style_GENERAL.css">
    <link rel="stylesheet" href="styles/style_CONCRETO.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
   
</head>
<body>

<%@ include file="includes/cabecera.jsp" %>
<%@ include file="includes/menu.jsp" %>

<main>
    <section class="servicios-container">

        <div class="servicio">
            <img src="img/habitaciones.jpg" alt="Habitaciones modernas">
            <h3><i class="fas fa-bed"></i> Habitaciones Confortables</h3>
            <p>Disfruta del máximo confort en nuestras habitaciones totalmente equipadas, con Wi-Fi, TV, minibar y servicio diario de limpieza.</p>
        </div>

        <div class="servicio">
            <img src="img/spa.jpg" alt="Spa y bienestar">
            <h3><i class="fas fa-spa"></i> Spa & Bienestar</h3>
            <p>Relájate en nuestra zona wellness con sauna, jacuzzi, masajes y tratamientos exclusivos para tu bienestar.</p>
        </div>

        <div class="servicio">
            <img src="img/piscina.jpg" alt="Piscina exterior">
            <h3><i class="fas fa-swimming-pool"></i> Piscina Exterior</h3>
            <p>Refréscate en nuestra piscina rodeada de jardines, con solárium, hamacas y servicio de bar.</p>
        </div>

        <div class="servicio">
            <img src="img/restaurante.jpg" alt="Restaurante gourmet">
            <h3><i class="fas fa-utensils"></i> Restaurante Gourmet</h3>
            <p>Saborea una experiencia gastronómica con productos locales, menú de temporada y opciones vegetarianas.</p>
        </div>

        <div class="servicio">
            <img src="img/gym.jpg" alt="Gimnasio moderno">
            <h3><i class="fas fa-dumbbell"></i> Gimnasio</h3>
            <p>Instalaciones modernas para mantener tu rutina de entrenamiento, con equipos de cardio y musculación.</p>
        </div>

        <div class="servicio">
            <img src="img/sala-eventos.jpg" alt="Sala de eventos">
            <h3><i class="fas fa-chalkboard-teacher"></i> Sala de Eventos</h3>
            <p>Salas versátiles para reuniones, conferencias o celebraciones privadas, con equipamiento audiovisual completo.</p>
        </div>

    </section>
</main>

<%@ include file="includes/pie.jsp" %>

</body>
</html>
