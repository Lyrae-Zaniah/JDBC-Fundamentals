package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTablePeople {

    static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        String sql = """
                    CREATE TABLE IF NOT EXISTS people (
                        code INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(80) NOT NULL
                    );
                    """;

        Statement stmt = connection.createStatement();
        stmt.execute(sql);

        System.out.println("People Table Successfully Created");
        connection.close();
    }
}
