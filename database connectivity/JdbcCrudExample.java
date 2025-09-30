import java.sql.*;
import java.util.Scanner;

public class JdbcCrudExample {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "987654";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");

            // Insert example
            String insert = "insert into student (name, age) values (?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insert);

            String[] names = {"Yash Gautam", "Harsh Gautam", "Kalash Gautam", "Parash Gautam"};
            int[] ages = {21, 22, 23, 20};

            for (int i = 0; i < names.length; i++) {
                insertStmt.setString(1, names[i]);
                insertStmt.setInt(2, ages[i]);
                insertStmt.executeUpdate();
            }
            System.out.println("✅ Data Inserted successfully.");

           

            System.out.print("Do you want to update y/n : ");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                updateStudent(conn);
                conn.close();
                System.out.println("🔒 Connection closed.");
            } else {
                System.out.println("Exiting...");
                conn.close();
                System.out.println("🔒 Connection closed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void updateStudent(Connection conn) throws SQLException {
        String update = "UPDATE student SET name = ? WHERE age = ?";
        PreparedStatement updateStmt = conn.prepareStatement(update);
        updateStmt.setString(1, "Yash");
        updateStmt.setInt(2, 21);
        updateStmt.executeUpdate();
        System.out.println("📝 Updated Data successfully.");
    }
}
