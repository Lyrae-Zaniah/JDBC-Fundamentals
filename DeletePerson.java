package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePerson {

    static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the code of the people you want to delete: ");
        int code = input.nextInt();

        Connection connection = ConnectionFactory.getConnection();
        String sql = "DELETE FROM people WHERE code = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, code);

        if(preparedStatement.executeUpdate() > 0){
            System.out.println("Person has been deleted successfully!");
        } else {
            System.out.println("Person could not be deleted!");
        }

        connection.close();
        input.close();
    }
}
