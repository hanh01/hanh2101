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
abstract public class SalaryPolicy {
    private float baseSalary;
    
    public SalaryPolicy(float baseSalary){
        this.baseSalary = baseSalary;
    }
    public float getBaseSalary(){
       return this.baseSalary;
    }
    public void setBaseSalary(float baseSalary){
        this.baseSalary = baseSalary;
    }
    
    abstract public float getSalary();
       
    
}
