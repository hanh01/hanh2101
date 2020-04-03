package Java2_09;

import java.sql.*;

public class JdbcPreparedStatementTest {
    public static void main (String [] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                PreparedStatement pstmt = conn.prepareStatement("insert into books values ( ?, ?, ?, ?, ?)");

                PreparedStatement pstmtSelect = conn.prepareStatement("select * from books");
        ) {
            pstmt.setInt(1, 7001);
            pstmt.setString(2, "Mahjong 101");
            pstmt.setString(3, "kumar");
            pstmt.setDouble(4, 88.88);
            pstmt.setInt(5, 88);
            int rowsInserted = pstmt.executeUpdate();

            pstmt.setInt(1, 7002);
            pstmt.setString(2, "Mahjong 102");
            rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + "row affected.");

            ResultSet rset = pstmtSelect.executeQuery();
            while (rset.next()) {
                int id = rset.getInt("id");
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id + ", " + title + ", " + price + ", " + qty);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
