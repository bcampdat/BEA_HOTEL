package com.ipartek.modelo;

public interface I_Constantes {

	// constantes de la BD
	String BD = "hotel_bea";
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONEXION = "jdbc:mysql://localhost:3306/" + BD;
	String USUARIO = "root";
	String PASS = "";

	// constantes de los JSP
	String JSP_INDEX = "index.jsp";
	String JSP_PAG1 = "index.jsp";
	String JSP_PAG2 = "servicios.jsp";


//	constantes de la mochila  setAttribute

	String ATR_LISTA_HAB = "lista_habitaciones";

//	STORED PROCEDURES

	String SP_INSERTAR_HAB = "call sp_insertar_habitacion(?,?,?,?);";
	String SP_OBTENER_TODAS_HAB = "call sp_obtener_todas_habitaciones();";
	String SP_ELIMINAR_HAB = "call sp_habitaciones_eliminar(?);";

}
