package Java2_08;

import java.util.Scanner;

public class ebookstore {
    public static Users user;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        Users us = new Users();
        JdbcUsers user1 = new JdbcUsers();
        Books books = new Books();
        Customers customers = new Customers();


        int n;
        System.out.println("0 - to shutdown" +
                "\n 1 - Dang ki" +
                "\n 2 - Dang nhap" +
                "\n 3 - Moi lua chon"
        );

        do {
            do {
                System.out.println(" ");
                System.out.print("Nhap vao lua chon : ");
                n = scanner.nextInt();

            } while (n < 0 || n > 3);
            switch (n) {
                case 1:
                    System.out.println("Moi ban dang ki :");
                    user1.SignUp(user);
                    break;

                case 2:
                    System.out.println("Moi ban dang nhap :");
                    user1.Login(user);
                    break;

                case 3:
                    System.out.println("0 - to shutdown" +
                            "\n 1 - Hien thi san pham" +
                            "\n 2 - Nhap them san pham" +
                            "\n 3 - Moi lua chon"
                    );
                    break;

                case 0:
                    break;
            }
        }while (n != 0);

    }
}
