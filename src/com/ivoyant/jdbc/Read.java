import java.sql.*;

public class Read {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:MySql://localhost:3306/student";
        String name = "root";
        String password = "system";

        String sqlRead = "select name, marks from student where id = 1";

        Connection connection = DriverManager.getConnection(url,name,password);
        Statement statement = connection.createStatement();

        //executeQuery for SELECT operations with the database.
        try{
            ResultSet resultSet = statement.executeQuery(sqlRead);
            resultSet.next();
            System.out.println("Name : "+resultSet.getString(1));
            System.out.println("Marks : "+resultSet.getInt(2));
        }catch (Exception e){
            System.out.println("Record do not exist");
        }finally {
            connection.close();
        }
    }
}
