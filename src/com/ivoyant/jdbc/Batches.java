import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Batches {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:MySql://localhost:3306/student";
        String name = "root";
        String password = "system";

        String query = "insert into student values(?,?,?);";

        Connection connection = DriverManager.getConnection(url, name, password);
        PreparedStatement statement = connection.prepareStatement(query);

        Scanner sc = new Scanner(System.in);
        try{
            while(true){
                connection.setAutoCommit(false);

                System.out.print("Enter ID : ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter name : ");
                String s_name = sc.nextLine();
                System.out.print("Enter marks : ");
                int marks = sc.nextInt();
                sc.nextLine();

                statement.setInt(1,id);
                statement.setString(2,s_name);
                statement.setInt(3,marks);
                statement.addBatch();

                System.out.print("Another Entry Y/N : ");
                String decision = sc.nextLine().toUpperCase();
                if(decision.equals("N")){
                    break;
                }
            }

            connection.commit();
            System.out.println("Commited successfully!");

        }catch (Exception e){
            System.out.println(e.getMessage());
            connection.rollback();
            System.out.println("Sorry, could not commit!");
        }

    }
}
