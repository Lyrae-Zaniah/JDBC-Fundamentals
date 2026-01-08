package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
            final String username = "root";
            final String password = "Gm@741qaz";

            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
