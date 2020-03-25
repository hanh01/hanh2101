package Java2_05;

import org.w3c.dom.Text;

import java.sql.*;

public class Don_hang {
    public  static void main(String [] args){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
                ){
            String strSelect = " Select * from don_hang " +
                    "inner join ct_dh on don_hang.id = ct_dh.id_dh " +
                    "inner join khach_hang on don_hang.kh_id = khach_hang.id where kh_id = 1";
            ResultSet rset = stmt.executeQuery(strSelect);
            int rowCount = 0;
            System.out.println("Hien thi don hang theo ma khach hang : ");
            while(rset.next()) {
                String ten = rset.getString("ten");
                Date thoi_gian = (Date) rset.getDate("thoi_gian");
                int so_luong = rset.getInt("so_luong");
                float giam_gia = rset.getFloat("giam_gia");
                System.out.println("Ten khach hang : " + ten + " , " + "thoi gian : "  + thoi_gian + " , "+ "so luong mua : " + so_luong + " , " + "giam gia : " + giam_gia);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(" ");


        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String strSelect = " Select trang_thai from don_hang where don_hang.id = 4 " ;

            ResultSet rset = stmt.executeQuery(strSelect);
            int rowCount = 0;
            System.out.println("Hien thi trang thai don hang theo ma don hang : ");
            while(rset.next()) {
                String trang_thai = rset.getString("trang_thai");
                System.out.println( "trang thai don hang : "  + trang_thai);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(" ");


        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String strSelect = " Select * from don_hang " +
                    "inner join ct_dh on don_hang.id = ct_dh.id_dh " +
                    "inner join khach_hang on don_hang.kh_id = khach_hang.id where don_hang.id = 1 ";
            ResultSet rset = stmt.executeQuery(strSelect);
            int rowCount = 0;
            System.out.println("Hien thi chi tiet don hang : ");
            while(rset.next()) {
                String ten = rset.getString("ten");
                Date thoi_gian = (Date) rset.getDate("thoi_gian");
                int so_luong = rset.getInt("so_luong");
                float giam_gia = rset.getFloat("giam_gia");
                String trang_thai = rset.getString("trang_thai");
                String dia_chi = rset.getString("dia_chi");
                System.out.println("Ten khach hang : " + ten + " , " + "Dia chi khach hang : " + dia_chi + " , " + "Thoi gian : "  + thoi_gian + " , "+ "So luong mua : " + so_luong + " , " + "Giam gia : " + giam_gia + " , "  + "Trang thai don hang :" + trang_thai);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(" ");








    }
}
