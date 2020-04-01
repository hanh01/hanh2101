package Java2_08;

import java.sql.*;
import java.util.Scanner;

public class Books {
    private static Scanner scanner = new Scanner(System.in);
    public  void InsertBook(){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            System.out.print("Enter id : ");
            String id = scanner.next();
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter price: ");
            double price= scanner.nextDouble();
            System.out.print("Enter qty: ");
            int qty = scanner.nextInt();
            System.out.print("Enter author: ");
            String author = scanner.next();
            System.out.print("Add a new list:");
            String sqlInsert = "insert into books values (" + "'" + id + "'" + "," + "'" + name + "'" + "," + price + "," + qty + "," + "'" + author + "'" + ")";
            System.out.println("The SQL statement is: "+ sqlInsert+ "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted+" records inserted.\n");

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Update(){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            System.out.print("Enter id : ");
            String id = scanner.next();
            System.out.print("Enter price : ");
            double price= scanner.nextDouble();
            System.out.print("Enter qty : ");
            int qty = scanner.nextInt();
            String Update = "update books set  qty =  " + qty + " ,  price = " + price +  " where  id =  " + "'" + id + "'" + "";
            System.out.println("The SQL statement is: " + Update + "\n");
            int countUpdated = stmt.executeUpdate(Update);
            System.out.println(countUpdated + "Da chinh sua.\n");

            String strSelect = "select * from books where id =  " + id + " ";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getString("id") + ", "
                        + rset.getString("name") + ", "
                        + rset.getDouble("price") + ", "
                        + rset.getInt("qty"));
            }

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Delete(){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            System.out.print("Enter id : ");
            String id = scanner.next();
            String Delete = "delete from books where  id =  " + id + "";
            System.out.println("The SQL statement is: " + Delete + "\n");
            int countUpdated = stmt.executeUpdate(Delete);
            System.out.println(countUpdated + "Da xoa.\n");

            String strSelect = "select * from books where id =  " + id + " ";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getString("id") + ", "
                        + rset.getString("name") + ", "
                        + rset.getDouble("price") + ", "
                        + rset.getInt("qty"));
            }

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Select(){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from books limit 100";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("name") + ", "
                        + rset.getDouble("price") + ", "
                        + rset.getInt("qty")
                );
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public  void Books (){
        int m;
        System.out.println("0 - to shutdown" +
                "\n 1 - Xem sach" +
                "\n 2 - Them sach" +
                "\n 3 - Chinh sua thong tin" +
                "\n 4 - Xoa sach" +
                "\n 5 - Quay lai lua chon"
        );
        Books book = new Books();

        do {
            do {
                System.out.println(" ");
                System.out.print("Nhap vao lua chon : ");
                m = scanner.nextInt();

            } while (m < 0 || m > 5);
            switch (m) {
                case 1:
                    System.out.println("Xem thong tin sach :");
                    book.Select();
                    break;

                case 2:
                    System.out.println("Moi ban them sach :");
                    book.InsertBook();
                    break;

                case 3:
                    System.out.println("Moi ban chinh sua thong tin :");
                    book.Update();
                    break;

                case 4:
                    System.out.println("Xoa sach :");
                    book.Delete();
                    break;

                case 5:
                    System.out.println("0 - to shutdown" +
                            "\n 1 - Xem sach" +
                            "\n 2 - Them sach" +
                            "\n 3 - Chinh sua thong tin" +
                            "\n 4 - Xoa sach" +
                            "\n 5 - Quay lai lua chon"
                    );

                case 0:
                    break;
            }
        }while (m != 0);
    }
}
