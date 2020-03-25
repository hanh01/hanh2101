package Java2_05;
import java.sql.*;
public class book {
    public static void main(String [] args){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from sach inner join loai_sach on sach.ls_id = loai_sach.id where loai_sach.ten_loai like 'khoa hoc'";
            ResultSet rset = stmt.executeQuery(strSelect);
            int rowCount = 0;
            System.out.println("Tim sach theo the loai : ");
            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                String ten = rset.getString("ten");
                float gia = rset.getFloat("gia");
                System.out.println("Ten sach : "+ ten + ", " + "Gia ban : " + gia );
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(" ");


        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String strSelect1 = "select * from sach inner join tac_gia on sach.tg_id =tac_gia.id where tac_gia.ten_tg like 'aaaa'";
            ResultSet rset1 = stmt.executeQuery(strSelect1);
            int rowCount1 = 0;
            System.out.println("Tim sach theo ten tac gia : ");
            while(rset1.next()) {   // Move the cursor to the next row, return false if no more row
                String ten = rset1.getString("ten");
                String ten_tg = rset1.getString("ten_tg");
                float gia = rset1.getFloat("gia");
                System.out.println("Ten sach : " + ten + " , " + "Ten tac gia : " + ten_tg + ", " + "Gia ban : " + gia );
                ++rowCount1;
            }
            System.out.println("Total number of records = " + rowCount1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(" ");


        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String strSelect2 = "select * from sach inner join tac_gia on sach.tg_id =tac_gia.id " +
                    "inner join loai_sach on sach.ls_id = loai_sach.id " +
                    "inner join nha_xuat_ban on sach.nxb_id = nha_xuat_ban.id";
            ResultSet rset2 = stmt.executeQuery(strSelect2);
            int rowCount2 = 0;
            System.out.println("Xem chi tiet sach : ");
            while(rset2.next()) {   // Move the cursor to the next row, return false if no more row
                String ten = rset2.getString("ten");
                float gia = rset2.getFloat("gia");
                String ten_nxb = rset2.getString("ten_nxb");
                String ten_loai = rset2.getString("ten_loai");
                String ten_tg = rset2.getString("ten_tg");
                System.out.println("ten sach : " + ten + " , " + " gia ban : " + gia + " , " + " ten nxb : " + ten_nxb + " , " + " ten loai : " + ten_loai + " , " + "ten tg : " + ten_tg );
                ++rowCount2;
            }
            System.out.println("Total number of records = " + rowCount2);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
