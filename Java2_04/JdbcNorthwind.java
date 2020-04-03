package Java2_04;

import java.sql.*;
import java.util.Scanner;

public class JdbcNorthwind {
    private static Scanner sc = new Scanner(System.in);
    public static void main (String [] args){
        try (

                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String Select = "select CompanyName from customers";

            ResultSet rset = stmt.executeQuery(Select);
            while (rset.next()){
                String CompanyName = rset.getString("CompanyName");
                System.out.println(CompanyName);
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }

        try (

                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String Select = "select * from customers where CompanyName = ' IT ' ";

            ResultSet rset = stmt.executeQuery(Select);
            while (rset.next()){
                System.out.println(Select);
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }

        try (

                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String Select = "select * from products ";

            ResultSet rset = stmt.executeQuery(Select);
            while (rset.next()){
                System.out.println(rset.getInt("ProductID")
                        + ", " + rset.getString("ProductName")
                        + ", " + rset.getString("QuantityPerUnit")
                        + ", " + rset.getDouble("UnitPrice")
                );
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }

        try (

                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String Select = "select * from orders ";

            ResultSet rset = stmt.executeQuery(Select);
            while (rset.next()){
                System.out.println(rset.getInt("OrderID")
                        + ", " + rset.getDate("OrderDate")
                        + ", " + rset.getDate("RequiredDate")
                        + ", " + rset.getInt("ShipVia")
                );
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }


        try (

                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String Select= "select * from  products where UnitPrice = 24.0000";
            ResultSet rset =stmt.executeQuery(Select);
            while(rset.next()){
                String proid= rset.getString( "ProductID");
                String name= rset.getString("ProductName");
                String supid= rset.getString("SupplierID");
                String cateid= rset.getString("CategoryID");
                String qpu= rset.getString("QuantityPerUnit");
                double up= rset.getDouble("UnitPrice");
                int uis= rset.getInt("UnitsInStock");
                int uoo= rset.getInt("UnitsOnOrder");
                int rl= rset.getInt("ReorderLevel");
                int dis= rset.getInt("Discontinued");
                System.out.println (proid + ", " + name + ", " + supid+ ", " + cateid + ", " + qpu + ", " + up + ", " + uis + ", " + uoo + ", " + rl + ", " + dis);}
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
