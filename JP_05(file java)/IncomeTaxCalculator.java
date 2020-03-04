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
public class IncomeTaxCalculator {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;
        
        int taxableIncome;
        double taxPayable;
        System.out.print("Enter the taxable income (or -1 to end): $");
        taxableIncome = in.nextInt();
        
        if(taxableIncome <= 20000){
            taxPayable = taxableIncome * 0;
        }else if(taxableIncome <= 40000){
            taxPayable = (taxableIncome - 20000)*0.1 ;
        }else if(taxableIncome <= 60000){
             taxPayable =(taxableIncome -40000)*0.2  +  20000*0.1;
        }else{
            taxPayable = (taxableIncome - 60000)*0.3  +  20000*0.2  + 20000*0.1;
        }
        
        System.out.format("TaxPayable : $%.2f%n",taxPayable);
    }
}
