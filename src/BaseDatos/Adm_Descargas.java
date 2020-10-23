package BaseDatos;

import Administradores.CRUDdescargas;
import TiendaMusik.Canciones;
import TiendaMusik.Usuario_sistema;
import java.sql.*;
import javax.swing.JOptionPane;


/*
 @author Castel...
 */
public class Adm_Descargas implements CRUDdescargas {

    @Override
    public boolean Descargar(Object obj) {
        boolean var = false;
        Connection c = null;
        Statement stmt = null;
        if (obj instanceof Canciones) {
            Canciones cancion = new Canciones();
            cancion = (Canciones) obj;
            
            
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String Sql = "INSERT INTO descargas (nombre,artista,genero,album,fecha,id) SELECT *FROM canciones WHERE id=" + cancion.getId_cancion()+";";
                stmt.executeUpdate(Sql);
                stmt.close();
                c.commit();
                c.close();
                var= true;
                
                stmt.close();
                c.close();
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }

        }
        return var;
    }

    @Override
    public void consultarTodos() {
         Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
            c.setAutoCommit(false);
            System.out.println("Base de Datos (tiendaMusikita) abierta");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM descargas;");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String artista = rs.getString("artista");
                String genero = rs.getString("genero");
                String album = rs.getString("album");
                String fecha = rs.getString("fecha");
                int id = rs.getInt("id");
                JOptionPane.showMessageDialog(null, " CANCION \nNombre: " + nombre + "\nArista: " + artista + "\nGenero: " + genero + "\nAlbum: " + album + "\nFecha: " + fecha + "\nIdentificador: " + id);

            }
            rs.close();
            stmt.close();
            c.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

   
}
