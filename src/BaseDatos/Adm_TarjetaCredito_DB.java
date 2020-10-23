
package BaseDatos;

import Administradores.CRUD;
import TiendaMusik.TarjetaCredita;
import java.sql.*;
import javax.swing.JOptionPane;


public class Adm_TarjetaCredito_DB implements CRUD{

    @Override
    public boolean crear(Object obj) {
        Connection c = null;
        Statement stmt = null;
        boolean var = false;
        if (obj instanceof TarjetaCredita) {
            TarjetaCredita credito = new TarjetaCredita();
            credito = (TarjetaCredita) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String Sql = "INSERT INTO tarjetacredito (numcuenta,saldo) values("
                        + credito.getNumcuenta() + "," + credito.getSaldo() + ")";
                stmt.executeUpdate(Sql);
                stmt.close();
                c.commit();
                c.close();
                var = true;
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.out.println("La cuenta existe ingrese otra");
            }
            System.out.println("Registro Guardado");
        }
        return var;
    
    }

   
    @Override
    public boolean Borrar(Object obj) {
        Connection c = null;
        Statement stmt = null;
        boolean var =false;
        if (obj instanceof TarjetaCredita) {
            TarjetaCredita credito = new TarjetaCredita();
            credito = (TarjetaCredita) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();
                String sql = "DELETE from tarjetacredito where numcuenta=" + credito.getNumcuenta() + ";";
                stmt.executeUpdate(sql);
                c.commit();
                var=true;
                stmt.close();
                c.close();
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
            System.out.println("Opercion ejecutada");
        }
        return var;
    }
       
    
    

    @Override
    public void Modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean mostrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public void buscar(Object obj) {
        Connection c = null;
        Statement stmt = null;
        if (obj instanceof TarjetaCredita) {
            TarjetaCredita credito = new TarjetaCredita();
            credito = (TarjetaCredita) obj;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tiendaMusikita", "postgres", "admin");
                c.setAutoCommit(false);
                System.out.println("Base de Datos (tiendaMusikita) abierta");
                stmt = c.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT *FROM tarjetacredito WHERE numcuenta=" + credito.getNumcuenta() + ";");
                if (rs.next()) {
                int num = rs.getInt("numcuenta");
                int saldo = rs.getInt("saldo");
                System.out.println(" TARJETA DE CREDITO \nNumero: " + num + "\nSaldo: " + saldo);

            }
                rs.close();
                stmt.close();
                c.close();
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        System.out.println("Operacion ejecutada");
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
            ResultSet rs = stmt.executeQuery("SELECT * FROM tarjetacredito;");
            while (rs.next()) {
                int num = rs.getInt("numcuenta");
                int saldo = rs.getInt("saldo");
                System.out.println(" TARJETA DE CREDITO \nNumero: " + num + "\nSaldo: " + saldo);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Operacion hehca con exito");

    }
 }


