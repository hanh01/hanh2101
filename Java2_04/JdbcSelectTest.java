package Java2_04;

import java.sql.*;

public class JdbcSelectTest {
public static void main(String[] args) {
        try (

           Connection conn = DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                 "root", "");

           Statement stmt = conn.createStatement();
        ) {
        String strSelect = "select title, price, qty from books";
        System.out.println("The SQL statement is: " + strSelect + "\n");

         ResultSet rset = stmt.executeQuery(strSelect);
        System.out.println("The records selected are:");
        int rowCount = 0;
        while(rset.next()) {
        String title = rset.getString("title");
        double price = rset.getDouble("price");
        int    qty   = rset.getInt("qty");
        System.out.println(title + ", " + price + ", " + qty);
        ++rowCount;
        }
        System.out.println("Total number of records = " + rowCount);

        } catch(SQLException ex) {
        ex.printStackTrace();
        }

        try (

                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
                String strSelect = "select title, price from books where author = 'Kumar' ";
                System.out.println("The SQL statement is: " + strSelect + "\n");

                ResultSet rset = stmt.executeQuery(strSelect);
                System.out.println("The records selected are:");
                int rowCount = 0;
                while(rset.next()) {
                        String title = rset.getString("title");
                        double price = rset.getDouble("price");
                        System.out.println(title + ", " + price );
                        ++rowCount;
                }
                System.out.println("Total number of records = " + rowCount);

        } catch(SQLException ex) {
                ex.printStackTrace();
        }

        try (

                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
                String strSelect = "select title,author,price,qty from books where author = 'Kumar' or price >= 30 order by price DESC, id ASC ";
                System.out.println("The SQL statement is: " + strSelect + "\n");

                ResultSet rset = stmt.executeQuery(strSelect);
                System.out.println("The records selected are:");
                int rowCount = 0;
                while(rset.next()) {
                        String title = rset.getString("title");
                        double price = rset.getDouble("price");
                        String author = rset.getString("author");
                        int qty = rset.getInt("qty");
                        System.out.println(title + ", " + price + ", " + author + ", " + qty  );
                        ++rowCount;
                }
                System.out.println("Total number of records = " + rowCount);

        } catch(SQLException ex) {
                ex.printStackTrace();
        }
}
}

