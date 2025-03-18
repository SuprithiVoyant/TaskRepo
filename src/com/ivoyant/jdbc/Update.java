import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:MySql://localhost:3306/student";
        String name = "root";
        String password = "system";

        String sqlUpdate = "UPDATE student SET name = 'Spiderman' WHERE id = 3;";

        Connection connection = DriverManager.getConnection(url,name,password);
        Statement statement = connection.createStatement();

        //execute Update for DML operations with the database.
        try{
            int n = statement.executeUpdate(sqlUpdate);
            System.out.println("Rows affected : "+n);
        }catch (Exception e){
            System.out.println("Not created!");
        }finally {
            connection.close();
        }
    }
}
