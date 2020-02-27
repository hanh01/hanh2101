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
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public Employee(){
        id = 3;
        firstName = "Nguyen";
        lastName = "A";
        salary = 3000000;
    }
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getID1(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
      return this.firstName + this.lastName ;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary ;
    }
    public int getAnnualSalaly(){
        return salary * 12;
    }
    public int raiseSalary(int percent){
        return salary * percent/100 +salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + '}';
    }
    
    
    
}
