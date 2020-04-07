package Exam;

import Exam2.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    JdbcStudent sc = new JdbcStudent();
    ArrayList<Student> studentlist = new ArrayList<>();
    public void addStudent(){
        System.out.println("Nhap vao ma sinh vien : ");
        String StudentID = scanner.next();
        System.out.println("Nhap vao ten sinh vien : ");
        String StudentName = scanner.nextLine();
        StudentName = scanner.nextLine();
        System.out.println("Nhap vao dia chi : ");
        String Address = scanner.nextLine();
        System.out.println("Nhap vao so dien thoai : ");
        int Phone = scanner.nextInt();
        Exam2.Student st = new Student(StudentID,StudentName,Address,Phone);
        studentlist.add(new Student(st.getStudentID(),st.getName(),st.getAddress(),st.getPhone()));
        System.out.println("Da them ");
    }


    public void saveStudent(){
        Iterator<Exam2.Student> StudentIterator = studentlist.iterator();
        while (StudentIterator.hasNext()){
            Student st1 = StudentIterator.next();
            sc.Insert(st1);
        }
        sc.Select();
    }

    
    public static void main (String [] args){
        JdbcStudent student = new JdbcStudent();
        Menu menu = new Menu();
        int n;
        System.out.println(
                " 1 - Them sinh vien" +
                "\n 2 - Hien thi danh sach" +
                "\n 3 - Luu" +
                "\n 4 - to shutdown"
        );

        do {
            do {
                System.out.println(" ");
                System.out.print("Nhap vao lua chon : ");
                n = scanner.nextInt();

            } while (n < 1 || n > 4);
            switch (n) {
                case 1:
                    System.out.println("Moi ban them sinh vien :");
                    menu.addStudent();
                    break;

                case 2:
                   student.Select();
                    break;

                case 3:
                    menu.saveStudent();
                    break;

                case 4:
                    break;
            }
        }while (n != 4);
    }

}
