import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:MySql://localhost:3306/student";
        String name = "root";
        String password = "system";

        //String sqlInsert = "insert into student values(2,'Batman',96)";
        String sqlSelect = "select name, marks from student where id = 1";

        Connection connection = DriverManager.getConnection(url,name,password);
        Statement statement = connection.createStatement();

        //Using execute Database operations
        //int n = statement.execute(sqlInsert);
        //System.out.println("Rows affected : "+n);

        connection.close();
    }
}

//Connection steps
//Load the JDBC driver
//Establish a connection to the database
//Create a statement or prepared statement
//Execute the SQL query
//Process the results
//Close the connection