package Java2_06;

import java.sql.*;
import java.util.Scanner;

public class JdbcEx1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){

        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
                ){
            String sqlDelete = "delete from books where id > 8000";
            System.out.println("The SQL statement is :" + sqlDelete + "\n");
            int countDelete = stmt.executeUpdate(sqlDelete);


            String sqlInsert = "insert into books values" +
                    "(8001,'Java Core','Dang Kim Thi',15.55,55),"
                    + "(8002,'Java Advanced','James Gosling',25.55,55)";
            System.out.println("The SQL statement is :" + sqlInsert + "\n");
           int countInsert = stmt.executeUpdate(sqlInsert);


//           sqlInsert = "insert into books values (2005,'Java JDBC MySQL','ThiDK')";
//        System.out.println("The SQL statement is :" + sqlInsert + "\n");
//        int countInserted1 = stmt.executeUpdate(sqlInsert);
//        System.out.println(countInserted1 + "records inserted.\n");


        System.out.println("Enter new name :");
        String sqlDelete1 = "delete from books where id = 1001";
        System.out.println("The SQL statement is :" + sqlDelete1 + "\n");
        int countDelete1 = stmt.executeUpdate(sqlDelete1);


           int id = scanner.nextInt();
           String title = scanner.next();
           String author = scanner.next();
           double price = scanner.nextDouble();
           int qty = scanner.nextInt();

        System.out.println("Enter new books :");
        String sqlInsert1 = "insert into books values (" + id + "," + "'" +title + "'" + "," + "'" + author + "'" + "," +  price  + "," + qty + ")";
        System.out.println("The SQL statement is :" + sqlInsert1 + "\n");
        int countInserted = stmt.executeUpdate(sqlInsert1);


        String strSelect = "select * from books";
        System.out.println("the SQL statement is : " + strSelect + "\n");
        ResultSet rset =  stmt.executeQuery(strSelect);
        while (rset.next()){
            System.out.println(rset.getInt("id") + ", "
                    + rset.getString("author") + ", "
                    + rset.getString("title") + ", "
                    + rset.getDouble("price") + ", "
                    + rset.getInt("qty")
            );
        }
    }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
