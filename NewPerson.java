package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewPerson {

    static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the name: ");
        String name = input.nextLine();

        Connection connection = ConnectionFactory.getConnection();

        String sql = "INSERT INTO people (name) VALUES (?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, name);

        stmt.execute();

        System.out.println("Person successfully added!");
        input.close();
    }
}
