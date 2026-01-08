package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String username = "root";
        final String password = "Gm@741qaz";

        Connection connection = DriverManager
                .getConnection(url, username, password);

        System.out.println("Conexão efetuada com sucesso!");
        connection.close();
    }
}
