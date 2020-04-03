package Java2_09;

import java.sql.*;

public class JdbcBatchProcessing {
    public static void main(String [] args){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
                PreparedStatement pstmtSelect  = conn.prepareStatement("select * from books");
        ){
            conn.setAutoCommit(false);

            stmt.addBatch("insert into books values (9001, 'Java ABC', 'Kevin Jones', 1.1,99)");
            stmt.addBatch("insert into books values (9002, 'Java XYZ', 'Kevin Jones', 1.1,99)");
            stmt.addBatch("update books set price = 11.11 where id = 9001 or id = 9002");
            int[] returnCodes = stmt.executeBatch();

            System.out.print("Return codes are: ");
            for(int code : returnCodes){
                System.out.printf(code + ",");
            }
            System.out.println();
            conn.commit();

            ResultSet rset = pstmtSelect.executeQuery();
            while (rset.next()) {
                int id = rset.getInt("id");
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id + ", " + title + ", " + price + ", " + qty);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }


        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                PreparedStatement pstmt = conn.prepareStatement("insert into books values ( ?, ?, ?, ?, ?)" );

                PreparedStatement pstmtSelect  = conn.prepareStatement("select * from books");
        ){
            conn.setAutoCommit(false);

            pstmt.setInt(1,8003);
            pstmt.setString(2,"Java 123");
            pstmt.setString(3,"Kevin Jones");
            pstmt.setDouble(4,12.35);
            pstmt.setInt(5,88);
            pstmt.addBatch();


            pstmt.setInt(1,8004);
            pstmt.setString(2,"Java 456");
            pstmt.addBatch();

            int[] returnCodes = pstmt.executeBatch();
            System.out.println("Return codes aer: ");
            for(int code : returnCodes) System.out.printf(code + " ,");
            System.out.println();
            conn.commit();

            ResultSet rset = pstmtSelect.executeQuery();
            while (rset.next()) {
                int id = rset.getInt("id");
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                String author = rset.getString("author");
                int qty = rset.getInt("qty");
                System.out.println(id + ", " + title + ", " + price + ", " + qty + ", " + author);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
