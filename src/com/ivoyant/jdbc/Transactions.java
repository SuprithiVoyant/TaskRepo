import java.sql.*;

public class Transactions {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:MySql://localhost:3306/student";
        String name = "root";
        String password = "system";

        //String sqlCreate = "insert into bank values(2,'tata',0)";

        Connection connection = DriverManager.getConnection(url,name,password);
        Statement statement = connection.createStatement();

        String sql = "select amount from bank where id = 1";

        //so now sbi has 40000 in its bank
        //tata bank needs 20000 from sbi.
        //sbi sends 20000 to tata, so now tata has 20000 and sbi has 20000.

        String sql1 = "UPDATE bank SET amount = 20000 WHERE id = 1;";
        String sql2 = "UPDATE bank SET amount = 20000 WHERE id = 2;";

        try{
            connection.setAutoCommit(false);
            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);
            connection.commit();
            System.out.println("Commited successfully");
        }catch (Exception e){
            System.out.println("Nope");
            connection.rollback();
            System.out.println("Could not be commited, Sorry");
        }
        connection.close();

    }
}
