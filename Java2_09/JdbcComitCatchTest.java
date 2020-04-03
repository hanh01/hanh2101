package Java2_09;

import java.sql.*;

public class JdbcComitCatchTest {
    public static void main(String [] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            conn.setAutoCommit(false);
            ResultSet rset = stmt.executeQuery("select id,qty from books where id in (1002,1003)");
            System.out.println("--Before UPDATE--");
            while (rset.next()){
                System.out.println(rset.getInt("id")+ "," + rset.getInt("qty"));
            }
            conn.commit();

            stmt.executeUpdate("update books set qty = qty + 1 where id = 1001");
            stmt.executeUpdate("update books set qty = qty + 1 where id = 1002");
            conn.commit();

            rset = stmt.executeQuery("select id,qty from books where id in (1002,1003)");
            System.out.println(" -- After UPDATE and Commit --");
            while(rset.next()){
                System.out.println(rset.getInt("id") + "," + rset.getInt("qty"));
            }
            conn.commit();

            stmt.executeUpdate("update books set qty = qty - 99 where id = 1002");
            stmt.executeUpdate("update books set qty = qty - 99 where id = 1003");
            conn.rollback();

            rset = stmt.executeQuery("select id,qty from books where id in (1002,1003)");
            System.out.println("-- After UPDATE and Rollback --");
            while(rset.next()){
                System.out.println(rset.getInt("id") + "," + rset.getInt("qty"));
            }


            rset = stmt.executeQuery  ("select * from books");
            System.out.println("The SQL statement is: " + rset + "\n");

            System.out.println("The records selected are:");
            while(rset.next()) {
                int id = rset.getInt("id");
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int    qty   = rset.getInt("qty");
                System.out.println(id + ", " + title + ", " + price + ", " + qty);
            }



            try {
                conn.setAutoCommit(false);
                stmt.executeUpdate("insert into books values(4007,'Paull Chan1','Mahjong1 1011',4.4,4)");
                stmt.executeUpdate("insert into books values(4008,'Peterr Chan1','Mahjong1 1021',4.4,4)");
                conn.commit();


            } catch (SQLException ex) {
                System.out.println("-- Rolling back changes --");
                conn.rollback();
                ex.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
