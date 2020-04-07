package Exam;

import Exam2.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JdbcStudent {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Menu> students= new ArrayList<>();
    public void addStudent(){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            System.out.println("Nhap vao id sinh vien : ");
            String id = scanner.next();
            System.out.println("Nhap vao ten sinh vien : ");
            String name = scanner.next();
            System.out.println("Nhap vao dia chi : ");
            String address = scanner.next();
            System.out.println("Nhap vao sdt : ");
            int phone = scanner.nextInt();
            Student student= new Student(id, name, address, phone);
            String Insert = "insert into student values ("+ "'" + student.getStudentID() + "'"  + "," + "'" + student.getName() + "'" + "," + "'" + student.getAddress() + "'" + "," + student.getPhone() + ")" ;
            System.out.println("The SQL statement is: "+ Insert+ "\n");
            int countInserted = stmt.executeUpdate(Insert);
            System.out.println(countInserted+" Da them.\n");


        }catch (
                SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void saveStudent(){
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                PreparedStatement pstmt = conn.prepareStatement("insert into student values (?, ?, ?, ?)");
        ) {
            conn.setAutoCommit(false);  // Disable auto-commit for each SQL statement
            for (int i=0; i<this.students.size();i++){
                pstmt.setString(1, students.get(i).getStudentID());
                pstmt.setString(2, students.get(i).getName());
                pstmt.setString(3, students.get(i).getAddress());
                pstmt.setString(4, students.get(i).getPhone());
                pstmt.addBatch();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void Select(){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            ResultSet rset = stmt.executeQuery("select * from student");

            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for(int i = 1; i <= numColumns; i++){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numColumns; i++){
                System.out.printf("%-30s", "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();

            while (rset.next()){
                for(int i = 1; i<= numColumns; i++){
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

        }catch (
                SQLException ex) {
            ex.printStackTrace();
        }
    }

}
