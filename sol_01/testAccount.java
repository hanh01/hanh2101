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
public class testAccount {
   public static void main(String [] args){
       Account a1 = new Account();
       System.out.println(a1.toString());
       System.out.println("Balance new :" + a1.credit(10));
       System.out.println("Subtract amount from balance :" + a1.debit(11));
       System.out.println("So tien trong tai khoan :" + a1.transferTo(a1, 8));
   }
}
