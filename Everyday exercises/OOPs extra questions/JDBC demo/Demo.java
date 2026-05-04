import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT * FROM Customer WHERE Balance > 5000";

        String url = "jdbc:mysql://localhost:3306/sandesh";
        String username = "mysql";
        String password = "root";

        Connection conn = DriverManager.getConnection(url, "root", "root");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
//        rs.next();
//        String name = rs.getString(1);

        //Print table header
        System.out.println("Account_no\tName\tAddress\t\tBalance");
        System.out.println("-----------------------------------------------------------");

        //Loop through all result rows
        while (rs.next()) {
            int accountNo = rs.getInt("Account_no");
            String customer_name = rs.getString("Name");
            String address = rs.getString("Address");
            double balance = rs.getDouble("Balance");

            System.out.println(accountNo + "\t\t" + customer_name + "\t\t" + address + "\t\t" + balance);
        }
       //Close resources
        rs.close();
        st.close();
        conn.close();
    }
}