package BaseDatos;

import Administradores.CRUD;
import TiendaMusik.Usuario_VIP;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 @author Castel
 */
public class Adm_usuarios_VIP_DB implements CRUD {

    @Override
    public boolean crear(Object obj) {
        Connection c = null;
        Statement stmt = null;
        boolean var = false;
        if (obj instanceof Usuario_VIP) {
            Usuario_VIP usuvip = new Usuario_VIP();
            usuvip = (Usuario_VIP) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String Sql = "INSERT INTO usuariovip (nombre,apellido,cedula,direccion,telefono,descuento,nickname,contrasena) values('"
                        + usuvip.getNombre() + "','" + usuvip.getApellido() + "',"
                        + usuvip.getCedula() + ",'" + usuvip.getDireccion() + "','"
                        + usuvip.getTelefono() + "','" + usuvip.getDescuento() + "','"
                        + usuvip.getNickname() + "','" + usuvip.getContrasena() + "')";
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
    public void buscar(Object obj) {
        Connection c = null;
        Statement stmt = null;
        if (obj instanceof Usuario_VIP) {
            Usuario_VIP usuvip = new Usuario_VIP();
            usuvip = (Usuario_VIP) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT *FROM usuariovip WHERE cedula=" + usuvip.getCedula() + ";");
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    int cedula = rs.getInt("cedula");
                    String direccion = rs.getString("direccion");
                    String telefono = rs.getString("telefono");
                    String descuento = rs.getString("descuento");
                    String nickname = rs.getString("nickname");
                    String contrasena = rs.getString("contrasena");
                    JOptionPane.showMessageDialog(null, " USUARIO VIP \nNombre: " + nombre + "\nApellido: " + apellido + "\nCedula: " + cedula + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nDescuento: " + descuento + "\nNickname: " + nickname + "\nContraseña: " + contrasena);

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
        if (obj instanceof Usuario_VIP) {
            Usuario_VIP usuvip = new Usuario_VIP();
            usuvip = (Usuario_VIP) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT *FROM usuariovip WHERE nickname='" + usuvip.getNickname() + "' AND contrasena='" + usuvip.getContrasena() + "';");
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
    public void consultarTodos() {
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
            c.setAutoCommit(false);
            System.out.println("Base de Datos (tiendaMusikita) abierta");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuariovip;");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int cedula = rs.getInt("cedula");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String descuento = rs.getString("descuento");
                String nickname = rs.getString("nickname");
                String contrasena = rs.getString("contrasena");
                JOptionPane.showMessageDialog(null, " USUARIO VIP \nNombre: " + nombre + "\nApellido: " + apellido + "\nCedula: " + cedula + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nDescuento: " + descuento + "\nNickname: " + nickname + "\nContraseña: " + contrasena);

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
        boolean var=false;
        if (obj instanceof Usuario_VIP) {
            Usuario_VIP usuvip = new Usuario_VIP();
            usuvip = (Usuario_VIP) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String sql = "DELETE from usuariovip where cedula=" + usuvip.getCedula() + ";";
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
        if (obj instanceof Usuario_VIP) {
            Usuario_VIP usuvip = new Usuario_VIP();
            usuvip = (Usuario_VIP) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String Sql = "UPDATE usuariovip set nombre='" + usuvip.getNombre() + "',apellido='" + usuvip.getApellido() + "',direccion='" + usuvip.getDireccion() + "',telefono='" + usuvip.getTelefono() + "',descuento='" + usuvip.getDescuento() + "',nickname='" + usuvip.getNickname() + "',contrasena='" + usuvip.getContrasena() + "' where cedula=" + usuvip.getCedula() + ";";
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
        Connection c = null;
        Statement stmt = null;
        boolean var = false;
        if (obj instanceof Usuario_VIP) {
            Usuario_VIP usuvip = new Usuario_VIP();
            usuvip = (Usuario_VIP) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT *FROM usuariovip WHERE cedula=" + usuvip.getCedula() + " AND contrasena='" + usuvip.getContrasena() + "';");
                while (rs.next()) {
                    var = true;
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    int cedula = rs.getInt("cedula");
                    String direccion = rs.getString("direccion");
                    String telefono = rs.getString("telefono");
                    String descuento = rs.getString("descuento");
                    String nickname = rs.getString("nickname");
                    String contrasena = rs.getString("contrasena");
                    JOptionPane.showMessageDialog(null, " USUARIO VIP \nNombre: " + nombre + "\nApellido: " + apellido + "\nCedula: " + cedula + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nDescuento: " + descuento + "\nNickname: " + nickname + "\nContraseña: " + contrasena);
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
