package Exam;

import Exam2.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JdbcStudent {
    private static Scanner scanner = new Scanner(System.in);
    public void Insert(Student student){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            String Insert = "insert into student values ("+ "'" + student.getStudentID() + "'"  + "," + "'" + student.getName() + "'" + "," + "'" + student.getAddress() + "'" + "," + student.getPhone() + ")" ;
            System.out.println("The SQL statement is: "+ Insert+ "\n");
            int countInserted = stmt.executeUpdate(Insert);
            System.out.println(countInserted+" Da luu vao ho so.\n");


        }catch (
                SQLException ex) {
            ex.printStackTrace();
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
