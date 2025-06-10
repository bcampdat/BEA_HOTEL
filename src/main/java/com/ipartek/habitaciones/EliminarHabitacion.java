package com.ipartek.habitaciones;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import com.ipartek.modelo.DB_Helper;
import com.ipartek.modelo.Habitacion;
import com.ipartek.modelo.I_Constantes;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EliminarHabitacion")
public class EliminarHabitacion extends HttpServlet implements I_Constantes {

    private static final long serialVersionUID = 1L;

    public EliminarHabitacion() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = 0;
        if (request.getParameter("p_id") != null) {
            try {
                id = Integer.parseInt(request.getParameter("p_id"));
            } catch (NumberFormatException e) {
                System.out.println("ID inválido");
            }
        }

        DB_Helper db = new DB_Helper();
        Connection con = db.conectar();

        db.eliminarPorId(id, con);
        List<Habitacion> listaHabitaciones = db.obtenerTodasHab(con);

        db.desconectar(con);

        request.setAttribute(ATR_LISTA_HAB, listaHabitaciones);  
        request.getRequestDispatcher(JSP_INDEX).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
