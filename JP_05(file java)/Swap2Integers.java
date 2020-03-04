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
public class Swap2Integers {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int x,y;
        System.out.println("nhap vao x :");
        x = in.nextInt();
        System.out.println("nhap vao y :");
        y = in.nextInt();
        
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("x :" + x);
        System.out.println("y :" + y);
    }
}
