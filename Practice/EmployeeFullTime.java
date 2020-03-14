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
public class EmployeeFullTime extends SalaryPolicy {
    private float rate;
 
    
    public EmployeeFullTime(float baseSalary){
      super(baseSalary); 
        rate = 4.0f;
    }
    
    public EmployeeFullTime(float baseSalary, float rate){
        super(baseSalary);
        this.rate = rate;
    }
    
    @Override
    public float getSalary(){
        return  rate * super.getBaseSalary();   
    }

    @Override
    public String toString() {
        return "EmployeeFullTime{" + "rate=" + rate + '}';
    }
    
    
}
