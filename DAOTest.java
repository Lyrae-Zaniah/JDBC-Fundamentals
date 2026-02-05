package JDBC;

public class DAOTest {

    static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO people (name) VALUES (?)";
        System.out.println(dao.include(sql, "João da Silva"));
        System.out.println(dao.include(sql, "Djalma Pinto"));
        System.out.println(dao.include(sql, "Roberto Pereira"));

        dao.close();
    }
}
