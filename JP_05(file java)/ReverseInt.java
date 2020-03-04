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
public class ReverseInt {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int inNumber;
        int inDigit = 0;
        
       System.out.print("InNumber = ");
       inNumber = in.nextInt();
        int a;
       while(inNumber >0){
           a = inNumber % 10;
           inNumber = inNumber/10;
           inDigit = inDigit*10 + a;
       }
       System.out.println("InDigit = " + inDigit);
    }
}
