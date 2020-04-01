package Java2_08;

import java.sql.*;
import java.util.Scanner;

public class Customers {
    private static Scanner scanner = new Scanner(System.in);
    public void Insert(){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            System.out.print("Enter id : ");
            String id = scanner.next();
            System.out.print("Enter name : ");
            String name = scanner.next();
            System.out.print("Enter email : ");
            String email = scanner.next();
            System.out.print("Enter phone : ");
            String phone = scanner.next();
            System.out.print("Enter address : ");
            String address = scanner.next();
            System.out.print("Enter level: ");
            int level = scanner.nextInt();
            System.out.print("Add a new list:");
            String sqlInsert = "insert into customers values (" + "'" + id + "'"+ "," + "'" + name + "'" + "," + "'" + email + "'" + "," + "'" + phone + "'" + "," + "'" + address + "'" + "," + level +  ")";
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
            System.out.print("Enter email : ");
            String email = scanner.next();
            System.out.print("Enter phone : ");
            String phone = scanner.next();
            System.out.print("Enter level: ");
            Integer level = scanner.nextInt();
            String Update = "update customers set  email =  " + "'" + email + "'" + " , phone = " + "'" + phone + "'" + " , level = " + level +  " where  id =  " +  "'" + id + "'" + "";
            System.out.println("The SQL statement is: " + Update + "\n");
            int countUpdated = stmt.executeUpdate(Update);
            System.out.println(countUpdated + " Da chinh sua.\n");

            String strSelect = "select * from customers where id =  " + id + " ";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getString("id") + ", "
                        + rset.getString("name") + ", "
                        + rset.getString("email") + ", "
                        + rset.getString("address") + ", "
                        + rset.getString("phone") + ", "
                        + rset.getInt("level"));
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
            String Delete = "delete from customers where  id =  " + id + "";
            System.out.println("The SQL statement is: " + Delete + "\n");
            int countUpdated = stmt.executeUpdate(Delete);
            System.out.println(countUpdated + "Da xoa.\n");

            String strSelect = "select * from customers where id =  " + id + " ";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getString("id") + ", "
                        + rset.getString("name") + ", "
                        + rset.getString("email") + ", "
                        + rset.getString("address") + ", "
                        + rset.getString("phone") + ", "
                        + rset.getInt("level"));
            }

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public  void Select(){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from customers limit 100";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                System.out.println(rset.getString("id") + ", "
                        + rset.getString("name") + ", "
                        + rset.getString("email") + ", "
                        + rset.getString("address") + ", "
                        + rset.getString("phone") + ", "
                        + rset.getInt("level"));
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Customers(){
        int p;
        System.out.println("0 - to shutdown" +
                "\n 1 - Xem thong tin khach hang" +
                "\n 2 - Them khach hang" +
                "\n 3 - Chinh sua thong tin" +
                "\n 4 - Xoa thong tin khach hang" +
                "\n 5 - Quay lai lua chon"
        );
        Customers customers = new Customers();

        do {
            do {
                System.out.println(" ");
                System.out.print("Nhap vao lua chon : ");
                p = scanner.nextInt();

            } while (p < 0 || p > 5);
            switch (p) {
                case 1:
                    System.out.println("Xem thong tin khach hang :");
                    customers.Select();
                    break;

                case 2:
                    System.out.println(" Them khach hang :");
                    customers.Insert();
                    break;

                case 3:
                    System.out.println("Moi ban chinh sua thong tin :");
                    customers.Update();
                    break;

                case 4:
                    System.out.println("Xoa thong tin khach hang :");
                    customers.Delete();
                    break;

                case 5:
                    System.out.println("0 - to shutdown" +
                            "\n 1 - Xem thong tin khach hang" +
                            "\n 2 - Them khach hang" +
                            "\n 3 - Chinh sua thong tin" +
                            "\n 4 - Xoa thong tin khach hang" +
                            "\n 5 - Quay lai lua chon"
                    );

                case 0:
                    break;
            }
        }while (p != 0);
    }
}




