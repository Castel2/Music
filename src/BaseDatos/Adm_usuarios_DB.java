package BaseDatos;

import Administradores.CRUD;
import TiendaMusik.Usuario_sistema;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 @author C
 */
public class Adm_usuarios_DB implements CRUD {

    @Override
    public boolean crear(Object obj) {
        Connection c = null;
        Statement stmt = null;
        boolean var = false;
        if (obj instanceof Usuario_sistema) {
            Usuario_sistema usu = new Usuario_sistema();
            usu = (Usuario_sistema) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String Sql = "INSERT INTO usuario (nombre,apellido,cedula,direccion,telefono,nickname,contrasena) values('"
                        + usu.getNombre() + "','" + usu.getApellido() + "',"
                        + usu.getCedula() + ",'" + usu.getDireccion() + "','"
                        + usu.getTelefono() + "','" + usu.getNickname() + "','"
                        + usu.getContrasena() + "')";
                stmt.executeUpdate(Sql);
                stmt.close();
                c.commit();
                c.close();
                var = true;
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Cedula existe ingrese otra");
            }
            System.out.println("Registro Guardado");
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
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuario;");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int cedula = rs.getInt("cedula");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String nickname = rs.getString("nickname");
                String contrasena = rs.getString("contrasena");
                JOptionPane.showMessageDialog(null, " USUARIO \nNombre: " + nombre + "\nApellido: " + apellido + "\nCedula: " + cedula + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nNickname: " + nickname + "\nContraseña: " + contrasena);

            }
            rs.close();
            stmt.close();
            c.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operacion hehca con exito");

    }

    @Override
    public boolean Borrar(Object obj) {
        Connection c = null;
        Statement stmt = null;
        boolean var=false;
        if (obj instanceof Usuario_sistema) {
            Usuario_sistema usu = new Usuario_sistema();
            usu = (Usuario_sistema) obj;
            var=true;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String sql = "DELETE from usuario where cedula=" + usu.getCedula() + ";";
                stmt.executeUpdate(sql);
                c.commit();
                
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
        if (obj instanceof Usuario_sistema) {
            Usuario_sistema usu = new Usuario_sistema();
            usu = (Usuario_sistema) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String Sql = "UPDATE usuario set nombre='" + usu.getNombre() + "',apellido='" + usu.getApellido() + "',direccion='" + usu.getDireccion() + "',telefono='" + usu.getTelefono() + "',nickname='" + usu.getNickname() + "',contrasena='" + usu.getContrasena() + "' where cedula=" + usu.getCedula() + ";";
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
    public void buscar(Object obj) {
        Connection c = null;
        Statement stmt = null;
        if (obj instanceof Usuario_sistema) {
            Usuario_sistema usu = new Usuario_sistema();
            usu = (Usuario_sistema) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT *FROM usuario WHERE cedula=" + usu.getCedula() + ";");
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    int cedula = rs.getInt("cedula");
                    String direccion = rs.getString("direccion");
                    String telefono = rs.getString("telefono");
                    String nickname = rs.getString("nickname");
                    String contrasena = rs.getString("contrasena");
                    JOptionPane.showMessageDialog(null, " USUARIO \nNombre: " + nombre + "\nApellido: " + apellido + "\nCedula: " + cedula + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nNickname: " + nickname + "\nContraseña: " + contrasena);
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
        Connection c = null;
        Statement stmt = null;
        boolean var = false;
        if (obj instanceof Usuario_sistema) {
            Usuario_sistema usu = new Usuario_sistema();
            usu = (Usuario_sistema) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT *FROM usuario WHERE nickname='" + usu.getNickname() + "' AND contrasena='" + usu.getContrasena() + "';");
                if (rs.next()) {
                    var = true;
                }
                rs.close();
                stmt.close();
                c.close();
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
        return var;
    }

    @Override
    public boolean mostrar(Object obj) {
        Connection c = null;
        Statement stmt = null;
        boolean var = false;
        if (obj instanceof Usuario_sistema) {
            Usuario_sistema usu = new Usuario_sistema();
            usu = (Usuario_sistema) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT *FROM usuario WHERE cedula=" + usu.getCedula() + " AND contrasena='" + usu.getContrasena() + "';");
                while (rs.next()) {
                    var = true;
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    int cedula = rs.getInt("cedula");
                    String direccion = rs.getString("direccion");
                    String telefono = rs.getString("telefono");
                    String nickname = rs.getString("nickname");
                    String contrasena = rs.getString("contrasena");
                    JOptionPane.showMessageDialog(null, " USUARIO \nNombre: " + nombre + "\nApellido: " + apellido + "\nCedula: " + cedula + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nNickname: " + nickname + "\nContraseña: " + contrasena);
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
