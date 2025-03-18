import java.sql.*;

public class Create {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:MySql://localhost:3306/student";
        String name = "root";
        String password = "system";

        String sqlCreate = "insert into student values(3,'Batman',96)";


        Connection connection = DriverManager.getConnection(url,name,password);
        Statement statement = connection.createStatement();

        try{
            int n = statement.executeUpdate(sqlCreate);
            System.out.println("Rows affected : "+n);
        }catch (Exception e){
            System.out.println("Not created!");
        }finally {
            connection.close();
        }
    }
}
