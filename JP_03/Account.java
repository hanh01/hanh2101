/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_03;

/**
 *
 * @author Admin
 */
public class Account {
    private int number;
    private double balance;
    
    public Account(int number, double balance){
        this.number = number;
        this.balance = balance;
    }
    public Account(int number){
        this.number = number;
        this.balance = 0.0;
    }
    public int getNumber(){
        return this.number;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void credit(double amount){
        balance = balance + amount;
    }
    public void debit(double amount){
        if (amount > balance){
            System.out.println("amount withdrawn exceeds the current balance!");
        }else{
            balance = balance - amount;
        }
    }
    public void transferTo( Account another ,double amount){
        if (amount > balance){
            System.out.println("amount withdraw exceeds the");
        }else{
            this.balance =  this.balance - amount;
            another.credit(amount);
        }       
    }

    @Override
    public String toString() {
        return String.format("A/C no:%d, Balance=%.2f", number, balance);
    }
      
}
