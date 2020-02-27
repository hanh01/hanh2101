/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol_01;

/**
 *
 * @author Admin
 */
public class testEmployee {
    public static void main (String [] args){
        Employee e1 = new Employee();
        System.out.println(e1.toString());
        System.out.println(e1.getName());
        System.out.println("Salary : " + e1.getSalary());
        System.out.println(e1.getAnnualSalaly());
        System.out.println(e1.raiseSalary(50));
        
       System.out.println("-----------------------------");
        e1.setSalary(4000000);
        System.out.println("Salary : " + e1.getSalary());
        System.out.println(e1.getAnnualSalaly());
        System.out.println(e1.raiseSalary(20));
    }
}
