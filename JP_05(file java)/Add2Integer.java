/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_05;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Add2Integer {
    public static void main(String [] args){
        int x,y,sum;
        Scanner a = new Scanner(System.in);
        System.out.println("nhap vao so thu 1 :");
        x = a.nextInt();
        System.out.println("nhap vao so thu 2 :");
        y = a.nextInt();
        
        System.out.println("Tinh tong 2 so :");
        sum = x + y;
        System.out.println(" x + y = " + sum);
        a.close();
    }
}
