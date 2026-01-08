package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultPeople2 {

    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);

        Connection connection = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM people WHERE name like ?";

        System.out.println("Inform the name: ");
        String research = input.nextLine();

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, "%" + research + "%");
        ResultSet result = stmt.executeQuery();

        List<Person> people = new ArrayList<>();

        while (result.next()) {
            int code = result.getInt("Code");
            String name = result.getString("Name");
            people.add(new Person(code, name));
        }

        for (Person p : people) {
            System.out.println(p.getCode() + " ==> " + p.getName());
        }

        input.close();
        stmt.close();
        connection.close();
    }
}
