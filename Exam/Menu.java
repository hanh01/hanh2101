package Exam;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String [] args){
        JdbcStudent student = new JdbcStudent();
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
                    student.addStudent();
                    break;

                case 2:
                   student.Select();
                    break;

                case 3:
                    student.saveStudent();
                    break;

                case 4:
                    break;
            }
        }while (n != 4);
    }
}
