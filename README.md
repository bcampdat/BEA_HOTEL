# Proyecto Gestión de Habitaciones - Java + MySQL

Este proyecto es una aplicación Java que se conecta a una base de datos MySQL para realizar operaciones CRUD sobre habitaciones de un hotel. Utiliza procedimientos almacenados para interactuar con la base de datos y emplea la librería Lombok para simplificar el manejo de clases POJO.

## Estructura del Proyecto

- **Habitacion.java**  
  Clase POJO con anotaciones de **Lombok** (`@Data`, `@Builder`, etc.) que representa una habitación.

- **DB_Helper.java**  
  Clase que contiene métodos para conectarse/desconectarse a la base de datos, así como para insertar, listar y eliminar habitaciones mediante procedimientos almacenados.

- **I_Constantes.java**  
  Interfaz que contiene constantes como la cadena de conexión a la base de datos, el nombre del driver JDBC y las llamadas a los stored procedures.

## Requisitos

- Java 8 o superior
- MySQL
- Lombok
- JDBC Driver para MySQL
- IDE como IntelliJ o Eclipse

## Instalación y Configuración

1. **Clona el repositorio** (o copia los archivos en tu entorno de desarrollo):

    ```bash
    git clone https://github.com/tu_usuario/gestion-habitaciones-java.git
    ```

2. **Base de datos:**

   Crea la base de datos y los procedimientos almacenados en MySQL:

   ```sql
   CREATE DATABASE hotel_bea;
   USE hotel_bea;

   CREATE TABLE habitaciones (
       id INT AUTO_INCREMENT PRIMARY KEY,
       num_hab INT NOT NULL,
       m_cuadrados INT NOT NULL,
       precio DOUBLE NOT NULL,
       num_camas INT NOT NULL,
       exterior BOOLEAN NOT NULL
   );

   DELIMITER //
   CREATE PROCEDURE sp_insertar_habitacion(
       IN p_num_hab INT,
       IN p_m_cuadrados INT,
       IN p_precio DOUBLE,
       IN p_num_camas INT,
       IN p_exterior BOOLEAN
   )
   BEGIN
       INSERT INTO habitaciones (num_hab, m_cuadrados, precio, num_camas, exterior)
       VALUES (p_num_hab, p_m_cuadrados, p_precio, p_num_camas, p_exterior);
   END //
   DELIMITER ;

   DELIMITER //
   CREATE PROCEDURE sp_obtener_todas_habitaciones()
   BEGIN
       SELECT * FROM habitaciones;
   END //
   DELIMITER ;

   DELIMITER //
   CREATE PROCEDURE sp_eliminar_habitacion(IN p_id INT)
   BEGIN
       DELETE FROM habitaciones WHERE id = p_id;
   END //
   DELIMITER ;
