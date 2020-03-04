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
public class AverageWithInputValidation {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        final int NUM_STUDENTS = 3;
        
        int numberIn;
        boolean isValid;
        int sum = 0;
        double average = 0.0;
  
        for (int i = 1;i <= NUM_STUDENTS; i++){
             isValid = false;
             
             System.out.print("Enter the mark (0-100) for student " + i + ": ");
               numberIn = in.nextInt();
               
           do{
            
               if(numberIn >= 0 && numberIn <= 100 ){
                       isValid = true;
               }else{
                   System.out.println("Invalid input, try again ...");
                   System.out.print("Enter the mark (0-100) for student " + i + ": ");
                     numberIn = in.nextInt();
               }
           }while(!isValid);
                
                 sum = sum + numberIn;
                 average = sum/3;
        } 
    
         System.out.printf("The average : %.2f%n ", average);
    }
}
