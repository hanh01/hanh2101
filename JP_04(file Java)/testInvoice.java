/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_04;

/**
 *
 * @author Admin
 */
public class testInvoice {
    public static void main(String [] args){
        Customer c2 = new Customer(2,"A",30);
        Invoice i1 = new Invoice(3,c2,2000);
        System.out.println("ID :" + i1.getID());
        System.out.println("Amount :" + i1.getAmount());
        System.out.println("AnountAfter :" + i1.getAmountAfterDiscount());
        
        System.out.println("--------------------");
        i1.setAmount(30000);
         System.out.println("Amount :" + i1.getAmount());
        System.out.println("AnountAfter :" + i1.getAmountAfterDiscount());
    }
}
