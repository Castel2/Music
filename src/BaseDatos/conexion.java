package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 @author Castel..
 */
public class conexion {

    public Connection postgresConn() {
        Connection con = null;
        try {
            Class.forName("Driver");
            String url = "jdbc:postgresql://localhost:5432/tiendaMusikita";
            String user = "postgres";
            String password = "admin";
            con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                System.out.println("Conectado a la DB");
            } else {
                System.out.println("Problemas de conexion");
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        return con;
    }
}
