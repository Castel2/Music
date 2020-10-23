package BaseDatos;

import Administradores.CRUD;
import TiendaMusik.Trabajador_sistema;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 @author Castel...
 */
public class Adm_trabajador_DB implements CRUD {

    @Override
    public boolean crear(Object obj) {
        Connection c = null;
        Statement stmt = null;
        boolean var = false;
        if (obj instanceof Trabajador_sistema) {
            Trabajador_sistema trabajador = new Trabajador_sistema();
            trabajador = (Trabajador_sistema) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String Sql = "INSERT INTO trabajadores (nombre,apellido,cedula,direccion,telefono,salario,nickname,contrasena) values('"
                        + trabajador.getNombre() + "','" + trabajador.getApellido() + "',"
                        + trabajador.getCedula() + ",'" + trabajador.getDireccion() + "','"
                        + trabajador.getTelefono() + "','" + trabajador.getSalario() + "','"
                        + trabajador.getNickname() + "','" + trabajador.getContrasena() + "')";
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
        if (obj instanceof Trabajador_sistema) {
            Trabajador_sistema trabajador = new Trabajador_sistema();
            trabajador = (Trabajador_sistema) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT *FROM trabajadores WHERE cedula=" + trabajador.getCedula() + ";");
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    int cedula = rs.getInt("cedula");
                    String direccion = rs.getString("direccion");
                    String telefono = rs.getString("telefono");
                    String salario = rs.getString("salario");
                    String nickname = rs.getString("nickname");
                    String contrasena = rs.getString("contrasena");
                    JOptionPane.showMessageDialog(null, " EMPLEADO \nNombre: " + nombre + "\nApellido: " + apellido + "\nCedula: " + cedula + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nSalario: " + salario + "\nNickname: " + nickname + "\nContraseña: " + contrasena);

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
        if (obj instanceof Trabajador_sistema) {
            Trabajador_sistema trabajador = new Trabajador_sistema();
            trabajador = (Trabajador_sistema) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT *FROM trabajadores WHERE nickname='" + trabajador.getNickname() + "' AND contrasena='" + trabajador.getContrasena() + "';");
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
            ResultSet rs = stmt.executeQuery("SELECT * FROM trabajadores;");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int cedula = rs.getInt("cedula");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String salario = rs.getString("salario");
                String nickname = rs.getString("nickname");
                String contrasena = rs.getString("contrasena");
                JOptionPane.showMessageDialog(null, " EMPLEADO \nNombre: " + nombre + "\nApellido: " + apellido + "\nCedula: " + cedula + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nSalario: " + salario + "\nNickname: " + nickname + "\nContraseña: " + contrasena);

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
        boolean var = false;
        if (obj instanceof Trabajador_sistema) {
            Trabajador_sistema trabajador = new Trabajador_sistema();
            trabajador = (Trabajador_sistema) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String sql = "DELETE from trabajadores where cedula=" + trabajador.getCedula() + ";";
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
        if (obj instanceof Trabajador_sistema) {
            Trabajador_sistema trabajador = new Trabajador_sistema();
            trabajador = (Trabajador_sistema) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String Sql = "UPDATE trabajadores set nombre='" + trabajador.getNombre() + "',apellido='" + trabajador.getApellido() + "',direccion='" + trabajador.getDireccion() + "',telefono='" + trabajador.getTelefono() + "',salario='" + trabajador.getSalario() + "',nickname='" + trabajador.getNickname() + "',contrasena='" + trabajador.getContrasena() + "' where cedula=" + trabajador.getCedula() + ";";
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
        if (obj instanceof Trabajador_sistema) {
            Trabajador_sistema trabajador = new Trabajador_sistema();
            trabajador = (Trabajador_sistema) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT *FROM trabajadores WHERE cedula=" + trabajador.getCedula() + " AND contrasena='" + trabajador.getContrasena() + "';");
                while (rs.next()) {
                    var = true;
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    int cedula = rs.getInt("cedula");
                    String direccion = rs.getString("direccion");
                    String telefono = rs.getString("telefono");
                    String salario = rs.getString("salario");
                    String nickname = rs.getString("nickname");
                    String contrasena = rs.getString("contrasena");
                    JOptionPane.showMessageDialog(null, " EMPLEADO \nNombre: " + nombre + "\nApellido: " + apellido + "\nCedula: " + cedula + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nSalario: " + salario + "\nNickname: " + nickname + "\nContraseña: " + contrasena);
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

    public boolean salario(Object obj) {
        Connection c = null;
        Statement stmt = null;
         boolean var = false;
        if (obj instanceof Trabajador_sistema) {
            Trabajador_sistema trabajador = new Trabajador_sistema();
            trabajador = (Trabajador_sistema) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT *FROM trabajadores WHERE cedula=" + trabajador.getCedula() + ";");
                while (rs.next()) {

                    String salario = rs.getString("salario");
                    var = true;
                    JOptionPane.showMessageDialog(null, " TU SALARIO  \nSalario: " + salario);

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
