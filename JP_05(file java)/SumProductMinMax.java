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
public class SumProductMinMax {
    public static void main(String [] args){
        int sum,product,min,max;
        int a,b,c;
        
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao so thu 1 :");
        a = in.nextInt();
        System.out.println("nhap vao so thu 2 :");
        b = in.nextInt();
        System.out.println("nhap vao so thu 3 :");
        c = in.nextInt();
 
        sum = a + b + c;
        System.out.println(" a + b + c = " + sum);
        product = a*b*c;
        System.out.println(" a * b * c = " + product);
        
        min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
         System.out.println("min = " + min);
        
        max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println("max = " + max);
    }
}
