import java.sql.*;
import java.util.Scanner;

public class DynamicQueries {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:MySql://localhost:3306/student";
        String name = "root";
        String password = "system";

        String sql = "insert into student values(?,?,?)";

        System.out.print("Enter ID : ");
        int ID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name : ");
        String studentName = sc.nextLine();

        System.out.print("Enter marks : ");
        int marks = sc.nextInt();

        Connection connection = DriverManager.getConnection(url,name,password);
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1,ID);
        statement.setString(2,studentName);
        statement.setInt(3,marks);

        int n = statement.executeUpdate();
        System.out.println("Rows affected : "+n);

        connection.close();

    }
}

