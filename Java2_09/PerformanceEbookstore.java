package Java2_09;

import java.sql.*;

public class PerformanceEbookstore {
    public static void main(String [] args){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                PreparedStatement pstmt = conn.prepareStatement("insert into users values ( ?, ?, ?, ?)" );
                PreparedStatement pstmt1 = conn.prepareStatement("delete from users where id = ? ");
                PreparedStatement pstmt2 = conn.prepareStatement("update users set username = ?, password = ? where id = ? ");
                PreparedStatement pstmt3  = conn.prepareStatement("select * from users");
        ){
            conn.setAutoCommit(false);
            pstmt.setInt(1,2);
            pstmt.setString(2,"DoHanh");
            pstmt.setString(3,"210101");
            pstmt.setInt(4,0);
            pstmt.addBatch();
            int[] returnCodes = pstmt.executeBatch();
            System.out.println("Return codes aer: ");
            for(int code : returnCodes) System.out.printf(code + " ,");
            System.out.println();
            conn.commit();

            pstmt1.setInt(1,13);
            pstmt1.executeUpdate();
            int[] returnCodes1 = pstmt1.executeBatch();
            System.out.println("Return codes aer: ");
            for(int code : returnCodes1) System.out.printf(code + " ,");
            System.out.println();
            conn.commit();

            pstmt2.setString(1,"NgocQuynh");
            pstmt2.setString(2,"0408");
            pstmt2.setInt(3,12);
            pstmt2.executeUpdate();
            int[] returnCodes2 = pstmt2.executeBatch();
            System.out.println("Return codes aer: ");
            for(int code : returnCodes2) System.out.printf(code + " ,");
            System.out.println();
            conn.commit();


            ResultSet rset = pstmt3.executeQuery();
            while(rset.next()){
                int id = rset.getInt("id");
                String username = rset.getString("username");
                String password = rset.getString("password");
                int role = rset.getInt("role");
                System.out.println(id + ", " + username + ", " + password + ", " + role);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }


        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                PreparedStatement pstmt = conn.prepareStatement("insert into customers(id,name,phone,email,address) values ( ?, ?, ?, ?,?)" );
                PreparedStatement pstmt1 = conn.prepareStatement("delete from customers where id = ? ");
                PreparedStatement pstmt2 = conn.prepareStatement("update customers set phone = ?, name = ? where id = ? ");
                PreparedStatement pstmt3  = conn.prepareStatement("select * from customers ");
        ){
            conn.setAutoCommit(false);
            pstmt.setInt(1,4);
            pstmt.setString(2,"DoHanh");
            pstmt.setString(3,"2563527");
            pstmt.setString(4,"dohanh2101@gmail.com");
            pstmt.setString(5,"Hung Ha - Thai Binh");
            pstmt.addBatch();
            int[] returnCodes = pstmt.executeBatch();
            System.out.println("Return codes aer: ");
            for(int code : returnCodes) System.out.printf(code + " ,");
            System.out.println();
            conn.commit();

            pstmt1.setInt(1,1);
            pstmt1.executeUpdate();
            int[] returnCodes1 = pstmt1.executeBatch();
            System.out.println("Return codes aer: ");
            for(int code : returnCodes1) System.out.printf(code + " ,");
            System.out.println();
            conn.commit();

            pstmt2.setString(1,"0753634");
            pstmt2.setString(2,"NgocQuynh");
            pstmt2.setInt(3,3);
            pstmt2.executeUpdate();
            int[] returnCodes2 = pstmt2.executeBatch();
            System.out.println("Return codes aer: ");
            for(int code : returnCodes2) System.out.printf(code + " ,");
            System.out.println();
            conn.commit();

            ResultSet rset = pstmt3.executeQuery();
            while(rset.next()){
                int id = rset.getInt("id");
                String name = rset.getString("name");
                String phone= rset.getString("phone");
                String email = rset.getString("email");
                String address = rset.getString("address");
                int level = rset.getInt("level");
                System.out.println(id + ", " + name + ", " + phone + ", " + email + ", " + address + ", " + level);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
