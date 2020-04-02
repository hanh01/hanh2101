package Java2_08;

import java.sql.*;
import java.util.Scanner;

public class JdbcUsers {
    private static Scanner scanner = new Scanner(System.in);
    public void SignUp(Users users){

        System.out.print("Username : ");
        String name = scanner.next();
        System.out.print("Password : ");
        String pass = scanner.next();
        System.out.print("role : ");
        Integer role = scanner.nextInt();

        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String Insert = "Insert into users(username,password,role) values ("  +  "'" + name + "'" + ", " + "'" + pass + "'" + "," + role +  ")";
            int countUpdated = stmt.executeUpdate(Insert);
            System.out.println(countUpdated + " Dang ki thanh cong\n");

            String strSelect = "select * from users ";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                System.out.println(rset.getInt("id")
                        + ", " + rset.getString("username")
                        + ", " + rset.getString("password")
                        + ", " + rset.getDouble("role"));
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public void Login(Users user) {
        Books book = new Books();
        Customers customers = new Customers();

        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){

            String Select = "Select * from users where username = " + "'" + user.getUsername() + " ', " + " password= " + "'" + user.getPassword() + "'";
            ResultSet rset = stmt.executeQuery(Select);
            if(rset.next()){
                System.out.println("Dang nhap thanh cong");


                System.out.println("0 - to shutdown" +
                        "\n 1 - book management" +
                        "\n 2 - customer management" +
                        "\n 3 - to print a list of available actions."+
                        "\n Choose your action:\n"
                );
                int n;

                do {
                    do {
                        System.out.print("Enter action: ");
                        Scanner scanner = new Scanner(System.in);
                        n = scanner.nextInt();

                    } while (n < 0 || n > 3);
                    switch (n) {
                        case 0:
                            break;
                        case 1:
                            book.Books();
                            break;

                        case 2:
                            customers.Customers();
                            break;
                        case 3:
                            System.out.println("0 - to shutdown" +
                                    "\n 1 - book management" +
                                    "\n 2 - customer management" +
                                    "\n 3 - to print a list of available actions."+
                                    "\n Choose your action:\n"
                            );
                            break;
                        default:
                            System.out.println("Enter action: (3 to show available actions)");
                    }
                }while (n != 0);


            }else{
                System.out.println("Dang nhap that bai, hay thu lai");
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
