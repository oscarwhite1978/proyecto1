package test;

import beans.Mascota;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionDB {

    public static void main(String[] args) {
        listarMascota();

    }

    public static void actualizarMascota(int id, String genero) {

        DBConnection con = new DBConnection();
        String sql = "UPDATE mascota SET genero = "
                + "'" + genero + "'WHERE id= " + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }

    public static void listarMascota() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM mascota";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                int id_mascota = rs.getInt("id_mascota");
                String nombre_mascota = rs.getString("nombre_mascota");
                String raza = rs.getString("raza");
                String genero = rs.getString("genero");
                int tamano = rs.getInt("tamano");
                int anos_mascota = rs.getInt("anos_mascota");
                String vacunado = rs.getString("vacunado");
                String esterilizado = rs.getString("esterilizado");
                String observaciones = rs.getString("observaciones");
                Mascota mascota = new Mascota(id_mascota, nombre_mascota, raza, genero,
                        tamano, anos_mascota, vacunado, esterilizado, observaciones);
                System.out.println(mascota.toString());

            }
            st.executeQuery(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

    }

}
