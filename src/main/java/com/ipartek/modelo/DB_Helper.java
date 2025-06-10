package com.ipartek.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DB_Helper implements I_Constantes {

    public Connection conectar() {
        Connection con = null;

        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(CONEXION, USUARIO, PASS);
            System.out.println("BASE DE DATOS CONECTADA");
        } catch (ClassNotFoundException e) {
            System.out.println("NO SE ENCONTRÓ EL DRIVER");
        } catch (SQLException e) {
            System.out.println("ERROR AL CONECTAR A LA BD");
        }

        return con;
    }

    public void desconectar(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("BASE DE DATOS DESCONECTADA");
            }
        } catch (SQLException e) {
            System.out.println("NO SE PUDO DESCONECTAR");
        }
    }

    public void insertarHab(Habitacion hab, Connection con) {
        try (CallableStatement cStmt = con.prepareCall(SP_INSERTAR_HAB)) {

            cStmt.setInt(1, hab.getNum_hab());
            cStmt.setInt(2, hab.getM_cuadrados());
            cStmt.setDouble(3, hab.getPrecio());
            cStmt.setInt(4, hab.getNum_camas());
            cStmt.setBoolean(5, hab.isExterior());

            cStmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Habitacion> obtenerTodasHab(Connection con) {
        List<Habitacion> lista = new ArrayList<>();

        try (CallableStatement cStmt = con.prepareCall(SP_OBTENER_TODAS_HAB)) {

            cStmt.execute();
            ResultSet rs = cStmt.getResultSet();

            while (rs.next()) {
                Habitacion hab = Habitacion.builder()
                    .id(rs.getInt("id"))
                    .num_hab(rs.getInt("num_hab"))
                    .m_cuadrados(rs.getInt("m_cuadrados"))
                    .precio(rs.getDouble("precio"))
                    .num_camas(rs.getInt("num_camas"))
                    .exterior(rs.getBoolean("exterior"))
                    .build();

                lista.add(hab);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR al obtener habitaciones");
        }

        return lista;
    }

    public void eliminarPorId(int id, Connection con) {
        try (CallableStatement cStmt = con.prepareCall(SP_ELIMINAR_HAB)) {
            cStmt.setInt(1, id);
            cStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
