/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author Admin
 */
public class testSalaryPolicy {
    public static void main(String [] args){
        EmployeeFullTime s1 = new EmployeeFullTime(10,5f);
        System.out.println(s1);
        System.out.println("Salary : " + s1.getSalary());
        
        
        System.out.println("");
        EmployeePartime s2  = new EmployeePartime(10.5f);
        System.out.println(s2);
        System.out.println("Salary : " + s2.getSalary());
        
        System.out.println("");
        SalaryPolicy s = new EmployeeFullTime(25.5f);
        System.out.println(s);
        System.out.println("Salary : " + s.getSalary());
        
       
    }
}
