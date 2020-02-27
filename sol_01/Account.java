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
public class Account {
    private String id;
    private String name;
    private int balance ;
    
    public Account(){
        id = "1";
        name = "A";
        balance = 0;
    }
    public Account(String id, String name){
        this.id = id;
        this.name= name;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    public int credit(int amount){
        return balance = balance + amount;
    }
    public int debit(int amount){
        if (amount <= balance ){
            return balance =  amount - balance;
        }
        else{
           System.out.println("Amount exceeded balance");}
        return balance;
    }
    public int transferTo(Account another, int amount){
        if (amount <= balance){
            return balance =  balance + amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return balance = balance + amount;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }
    
}
