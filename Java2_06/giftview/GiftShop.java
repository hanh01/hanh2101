package Java2_06.giftview;
import com.mysql.jdbc.*;
import java.util.*;
import Java2_06.giftcontroller.GiftController;
import Java2_06.giftmodel.Gift;

import java.util.Scanner;

public class GiftShop {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Gift gift = new Gift();

        int n;
        System.out.println("0 - to shutdown" +
                "\n 1 - Hien thi san pham" +
                "\n 2 - Nhap them san pham" +
                "\n 3 - Xoa san pham" +
                "\n 4 - Moi lua chon"
        );
        GiftController gc = new GiftController();

        do {
            do {
                System.out.println(" ");
                System.out.print("Nhap vao luc chon : ");
                n = scanner.nextInt();

            } while (n < 0 || n > 4);
            switch (n) {
                case 1:
                    System.out.println("Hien thi danh sach :");
                    gc.giftSelect();
                    break;

                case 2:
                    System.out.println("Them san pham :");
                    gc.giftInsert(gift);
                    break;

                case 3:
                    System.out.println("Xoa san pham :");
                    gc.giftDelete(gift);
                    break;

                case 4:
                    System.out.println("0 - to shutdown" +
                            "\n 1 - Hien thi san pham" +
                            "\n 2 - Nhap them san pham" +
                            "\n 3 - Xoa san pham" +
                            "\n 4 - Moi lua chon"
                    );
                    break;

                case 0:
                    break;
            }
        }while (n != 0);
    }
}
