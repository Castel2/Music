 package BaseDatos;

import Administradores.CRUD;
import TiendaMusik.Canciones;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 @author Castel
 */
public class Adm_canciones_DB implements CRUD {

    @Override
    public boolean crear(Object obj) {
        Connection c = null;
        Statement stmt = null;
        boolean var = false;
        if (obj instanceof Canciones) {
            Canciones cancion = new Canciones();
            cancion = (Canciones) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String Sql = "INSERT INTO canciones (nombre,artista,genero,album,fecha,id) values('"
                        + cancion.getNombre() + "','" + cancion.getArtista() + "','"
                        + cancion.getGenero() + "','" + cancion.getAlbum() + "','"
                        + cancion.getFecha_ao() + "'," + cancion.getId_cancion() + ")";
                stmt.executeUpdate(Sql);
                stmt.close();
                c.commit();
                c.close();
                var = true;
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                JOptionPane.showMessageDialog(null, "El identificador existe ingrese otro");
            }
            System.out.println("Registro Guardado");
        }
        return var;
    }

    @Override
    public void buscar(Object obj) {
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
    }

    @Override
    public boolean consultar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            ResultSet rs = stmt.executeQuery("SELECT * FROM canciones;");
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
        System.out.println("Operacion hehca con exito");

    }

    @Override
    public boolean Borrar(Object obj) {
        Connection c = null;
        Statement stmt = null;
        boolean var =false;
        if (obj instanceof Canciones) {
            Canciones cancion = new Canciones();
            cancion = (Canciones) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String sql = "DELETE from canciones where id=" + cancion.getId_cancion() + ";";
                stmt.executeUpdate(sql);
                c.commit();
                var=true;
                stmt.close();
                c.close();
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
        return var;
    }

    @Override
    public void Modificar(Object obj) {
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
                String Sql = "UPDATE canciones set nombre='" + cancion.getNombre() + "',artista='" + cancion.getArtista() + "',genero='" + cancion.getGenero() + "',album='" + cancion.getAlbum() + "',fecha='" + cancion.getFecha_ao() + "' where id=" + cancion.getId_cancion() + ";";
                stmt.executeUpdate(Sql);
                c.commit();

                stmt.close();
                c.close();
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
    }

    @Override
    public boolean mostrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
