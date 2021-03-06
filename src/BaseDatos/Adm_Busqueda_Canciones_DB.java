package BaseDatos;

import Administradores.CRUDcanciones;
import TiendaMusik.Canciones;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 @author Castel
 */
public class Adm_Busqueda_Canciones_DB implements CRUDcanciones {

    @Override
    public boolean BuscarNombre(Object obj) {
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

                ResultSet rs = stmt.executeQuery("SELECT *FROM canciones WHERE nombre='" + cancion.getNombre() + "';");
                while (rs.next()) {
                    var = true;
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
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }

        }
        return var;
    }

    @Override
    public boolean BuscarArtista(Object obj) {
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

                ResultSet rs = stmt.executeQuery("SELECT *FROM canciones WHERE artista='" + cancion.getArtista() + "';");
                while (rs.next()) {
                    var = true;
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
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
        return var;
    }

    @Override
    public boolean BuscarId(Object obj) {
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

                ResultSet rs = stmt.executeQuery("SELECT *FROM canciones WHERE id=" + cancion.getId_cancion() + ";");
                while (rs.next()) {
                    var = true;
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
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
        return var;
    }

    @Override
    public boolean BuscarGenero(Object obj) {
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

                ResultSet rs = stmt.executeQuery("SELECT *FROM canciones WHERE genero='" + cancion.getGenero() + "';");
                while (rs.next()) {
                    var = true;
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
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
        return var;
    }
    
    
   

}
