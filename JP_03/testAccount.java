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
public class testAccount {
    public static void main (String [] args){
        Account a1 = new Account(1,1.0);
        System.out.println(a1.toString());
        Account a2 = new Account(2,5.0);
        System.out.println(a2.toString());
        
        a1.setBalance(99.00);
        System.out.println("Balance :" + a1.getBalance());
        System.out.println("Numbers" + a1.getNumber());
        a1.credit(1.0);
        System.out.println(a1);
        a1.debit(5.0);
        System.out.println(a1);
        
        a1.transferTo(a2,5.0);
        System.out.println(a2);
    }
}
