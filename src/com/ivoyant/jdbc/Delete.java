import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:MySql://localhost:3306/student";
        String name = "root";
        String password = "system";

        String sqlUpdate = "DELETE FROM student WHERE id = 2;";

        Connection connection = DriverManager.getConnection(url,name,password);
        Statement statement = connection.createStatement();

        try{
            int n = statement.executeUpdate(sqlUpdate);
            System.out.println("Rows affected : "+n);
        }catch (Exception e){
            System.out.println("This record does not exist!");
        }finally {
            connection.close();
        }
    }
}
