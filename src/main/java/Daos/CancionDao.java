package Daos;

import Beans.Cancion;

import java.sql.*;
import java.util.ArrayList;

public class CancionDao {

    private static String user = "root";
    private static String pass = "root";
    private static String url = "jdbc:mysql://localhost:3306/lab6sw1?serverTimezone=America/Lima";


    public ArrayList<Cancion> obtenerListaCanciones(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Cancion> listaCancionesRecomendadas = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from tour where nombre_tour like '%world%'")) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String banda = rs.getString(3);

                listaCancionesRecomendadas.add(new Cancion(id,nombre,banda));
            }

        } catch (SQLException e) {
            System.out.println("No se pudo realizar la busqueda");
        }
        return listaCancionesRecomendadas:


        ;
    }




}