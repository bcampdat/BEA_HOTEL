package com.ipartek.habitaciones;

import java.io.IOException;
import java.sql.Connection;

import com.ipartek.modelo.DB_Helper;
import com.ipartek.modelo.Habitacion;
import com.ipartek.modelo.I_Constantes;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/InsertarHabitacion")
public class InsertarHabitacion extends HttpServlet implements I_Constantes {
	private static final long serialVersionUID = 1L;

	public InsertarHabitacion() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// PASO 1: Recoger parámetros del formulario

		int numHab = 0;
		if (request.getParameter("p_num_hab") != null) {
			String numHabTemp = request.getParameter("p_num_hab");
			numHab = Integer.parseInt(numHabTemp);
		}

		int metros = 0;
		if (request.getParameter("p_metros") != null) {
			String metrosTemp = request.getParameter("p_metros");
			metros = Integer.parseInt(metrosTemp);
		}

		double precio = 0;
		if (request.getParameter("p_precio") != null) {
			String precioTemp = request.getParameter("p_precio");
			precio = Double.parseDouble(precioTemp);
		}

		int numCamas = 0;
		if (request.getParameter("p_num_camas") != null) {
			String numCamasTemp = request.getParameter("p_num_camas");
			numCamas = Integer.parseInt(numCamasTemp);
		}

		boolean exterior = false;
		if (request.getParameter("p_exterior") != null) {
			exterior = true;
		}

		// PASO 2: Crear objeto Habitacion
		Habitacion hab = Habitacion.builder()
				.num_hab(numHab)
				.m_cuadrados(metros)
				.precio(precio)
				.num_camas(numCamas)
				.exterior(exterior)
				.build();

		// PASO 3: Conectar a BD
		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();

		// PASO 4: Insertar en BD
		db.insertarHab(hab, con);

		// PASO 5: Desconectar BD
		db.desconectar(con);

		// PASO 6: Redirigir
		request.getRequestDispatcher(JSP_INDEX).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
