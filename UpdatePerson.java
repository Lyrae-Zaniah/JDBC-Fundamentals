package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePerson {

    static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the name: ");
        String name = input.nextLine();

        System.out.println("Please provide the id: ");
        int code = input.nextInt();

        Connection connection = ConnectionFactory.getConnection();
        String sql = "UPDATE people SET name = ? WHERE code = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, code);
        preparedStatement.executeUpdate();
        ResultSet r = preparedStatement.getResultSet();

        System.out.println("Successfully updated people");

        input.close();
        connection.close();
        }
    }
