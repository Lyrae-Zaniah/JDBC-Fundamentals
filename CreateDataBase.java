package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDataBase {

    static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String username = "root";
        final String password = "Gm@741qaz";

        Connection connection = DriverManager
                .getConnection(url, username, password);

        Statement stmt = connection.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Database created");
        connection.close();
    }
}
