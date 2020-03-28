package Java2_06.giftview;
import com.mysql.jdbc.*;

import java.sql.SQLType;
import java.util.*;
import Java2_06.giftcontroller.GiftController;
import Java2_06.giftmodel.Gift;

import java.util.Scanner;

public class GiftShop {
    private static Scanner scanner = new Scanner(System.in);
    GiftController gc = new GiftController();
    Gift gift1 = new Gift();

    public void Insert(){
        System.out.println("Them san pham :");
        System.out.print("Nhap vao id sp : ");
        int id = scanner.nextInt();
        System.out.print("Nhap vao ten sp : ");
        String name = scanner.next();
        System.out.print("Nhap vao gia ban : ");
        double price = scanner.nextDouble();
        System.out.print("Nhap vao so luong sp : ");
        int qty = scanner.nextInt();
        Gift gift = new Gift(id,name,price,qty);
        gc.giftInsert(gift);
    }

    public void Delete(){
        System.out.println("Xoa san pham :");
        gc.giftDelete(gift1);
    }

    public static void main(String[] args) {
        GiftController gc = new GiftController();
        GiftShop gs = new GiftShop();

        int n;
        System.out.println("0 - to shutdown" +
                "\n 1 - Hien thi san pham" +
                "\n 2 - Nhap them san pham" +
                "\n 3 - Xoa san pham" +
                "\n 4 - Moi lua chon"
        );

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
                    gs.Insert();
                    break;

                case 3:
                    gs.Delete();
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
