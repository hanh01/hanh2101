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
public class SumOfDigitsInt {
    public static void main (String [] args){
         Scanner in = new Scanner(System.in);
         int x,sum = 0;
         
        System.out.print("InNumber = ");
        x = in.nextInt();
        
        int a ;
        while(x >0){
            a = x % 10;
            x = x/10;
            sum = sum + a;
        }
         System.out.println("Sum = " + sum);
    }
 
}
