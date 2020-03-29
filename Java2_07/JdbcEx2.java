package Java2_07;

import java.sql.*;
import java.lang.Double;
public class JdbcEx2 {
    public static void main(String [] args){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String strUpdate = "update categories set CategoryName = 'Seafood VN' where CategoryName = 'Seafood' ";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + "records affected.\n");

            String strSelect = "select * from categories where CategoryName = 'Seafood'  ";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("CategoryID") + ", "
                        + rset.getString("CategoryName") + ", "
                        + rset.getString("Description") + ", "
                        + rset.getString("Picture"));
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }

        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String strUpdate = "update customers set Address = '1A Yet Kieu - Ha Noi' where CustomerID = 'FRANK' ";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);

            String strSelect = "select * from customers where CustomerID = 'FRANK'  ";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getString("CustomerID") + ", "
                        + rset.getString("CompanyName") + ", "
                        + rset.getString("ContactName") + ", "
                        + rset.getString("ContactTitle") + ", "
                        + rset.getString("ContactTitle") + ", "
                        + rset.getString("ContactTitle") + ", "
                        + rset.getString("Address")
                );
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }


        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String strUpdate = "update products set UnitPrice = UnitPrice + UnitPrice*0.1 where CategoryID = 5 or CategoryID = 7 or CategoryID = 8 ";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);

            String strSelect = "select * from products where CategoryID = 5 or CategoryID = 7 or CategoryID = 8 ";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("CategoryID") + ", "
                        + rset.getString("QuantityPerUnit") + ", "
                        + rset.getDouble("UnitPrice") + ", "
                        + rset.getInt("UnitsInStock") + ", "
                        + rset.getInt("UnitsOnOrder") + ", "
                        + rset.getInt("ReorderLevel") + ", "
                        + rset.getInt("Discontinued")

                );
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }

        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String strUpdate1 = "update orders set ShipVia = 3 where OrderID = 10313";
            System.out.println("The SQL statement is: " + strUpdate1 + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate1);

            String strSelect1 = "select * from orders where OrderID = 10313 ";
            ResultSet rset = stmt.executeQuery(strSelect1);
            while (rset.next()){
                System.out.println(rset.getInt("OrderID") + ", "
                        + rset.getString("CustomerID") + ", "
                        + rset.getDate("OrderDate") + ", "
                        + rset.getDate("RequiredDate") + ", "
                        + rset.getDate("ShippedDate") + ", "
                        + rset.getInt("ShipVia") + ", "
                        + rset.getInt("Freight") + ", "
                        + rset.getString("ShipName") + ", "
                        + rset.getString("ShipAddress") + ", "
                        + rset.getString("ShipCity") + ", "
                        + rset.getString("ShipRegion") + ", "
                        + rset.getString("ShipPostalCode") + ", "
                        + rset.getString("ShipCountry"));

            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }



    }
}
