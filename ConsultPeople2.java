package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultPeople2 {

    public static void main(String[] args) throws SQLException {

        Connection connection = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM people";

        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        List<Person> people = new ArrayList<>();

        while (result.next()) {
            int code = result.getInt("Code");
            String name = result.getString("Name");
            people.add(new Person(code, name));
        }

        for (Person p : people) {
            System.out.println(p.getCode() + " ==> " + p.getName());
        }

        stmt.close();
        connection.close();
    }
}
