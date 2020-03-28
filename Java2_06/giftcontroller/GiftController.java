package Java2_06.giftcontroller;

import Java2_05.book;
import Java2_06.giftmodel.Gift;

import java.sql.*;
import java.util.Scanner;

public class GiftController {
    private static Scanner scanner = new Scanner(System.in);

        public void giftInsert(Gift book) {
            try (
                    Connection conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                            "root","");

                    Statement stmt = conn.createStatement();
            ) {
                System.out.print("Nhap vao id sp : ");
                String id = scanner.next();
                System.out.print("Nhap vao ten sp : ");
                String name = scanner.next();
                System.out.print("Nhap vao gia ban : ");
                double price = scanner.nextDouble();
                System.out.print("Nhap vao so luong sp : ");
                int qty = scanner.nextInt();

                System.out.print("Danh sach sau khi them :");
                String Insert = "insert into book values ("  + "'" + id + "'"  + "," + "'" + name + "'" + "," + price + "," + qty + ")";
                int countInserted = stmt.executeUpdate(Insert);

                System.out.println(" ");
                String strSelect = "select * from book";
                ResultSet rset = stmt.executeQuery(strSelect);
                while (rset.next()) {
                    System.out.println(rset.getInt("id") + ", "
                            + rset.getString("name") + ", "
                            + rset.getDouble("price") + ", "
                            + rset.getInt("qty")
                    );
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }


        public void giftDelete(Gift book) {
            try (
                    Connection conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                            "root", "");

                    Statement stmt = conn.createStatement();
            ){
                System.out.print("Nhap vao id sp : ");
                String id = scanner.next();
                System.out.print("Xoa sp :");
                String Delete = "delete from book where id = " + id;
                int countDeleted = stmt.executeUpdate(Delete);
                System.out.println("da xoa");

                String strSelect = "select * from book";
                ResultSet rset = stmt.executeQuery(strSelect);
                while (rset.next()) {
                    System.out.println(rset.getInt("id") + ", "
                            + rset.getString("name") + ", "
                            + rset.getDouble("price") + ", "
                            + rset.getInt("qty")
                    );
                }
            } catch (SQLException ex) {
                    ex.printStackTrace();
            }

        }


        public void giftSelect() {
            try (
                    Connection conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                            "root", "");

                        Statement stmt = conn.createStatement();
                ) {
                String strSelect = "select * from book";
                ResultSet rset = stmt.executeQuery(strSelect);
                while (rset.next()) {
                    System.out.println(rset.getInt("id") + ", "
                            + rset.getString("name") + ", "
                            + rset.getDouble("price") + ", "
                            + rset.getInt("qty")
                    );
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }


}













