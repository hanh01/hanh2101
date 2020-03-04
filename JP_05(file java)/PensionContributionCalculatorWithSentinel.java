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
public class PensionContributionCalculatorWithSentinel {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
         final int SENTINEL = -1;
        
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075; 
          
        int salary,age;
        int contributableSalary;
        double employeeContribution,employerContribution,totalContribution;
        
        System.out.print("Enter the monthly salary (or -1 to end) : $");
        salary = in.nextInt();
        
        while(salary != SENTINEL){
            System.out.print("do tuoi :");
               age = in.nextInt();
        
        if(age <= 55){
            employeeContribution = salary * 0.2;
            employerContribution = salary * 0.17;
            totalContribution = employeeContribution + employerContribution;
        }else if(age <= 60){
            employeeContribution = salary * 0.13;
            employerContribution = salary * 0.13;
            totalContribution = employeeContribution + employerContribution;
        }else if (age <= 65){
            employeeContribution = salary * 0.075;
            employerContribution = salary * 0.09;
            totalContribution = employeeContribution + employerContribution;
        }else{
            employeeContribution = salary * 0.05;
            employerContribution = salary * 0.075;
            totalContribution = employeeContribution + employerContribution;
        }
        
        System.out.format("The employee's contribution  : $%.2f%n",employeeContribution);
        System.out.format("The employer's contribution  : $%.2f%n",employerContribution);
        System.out.format("The total contribution  : $%.2f%n",totalContribution);
        
         System.out.print("Enter the monthly salary (or -1 to end) : $");
         salary = in.nextInt();
        }
        
        System.out.println("bye!");
    }
}
