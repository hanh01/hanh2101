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
public class testCustomer {
    public static void main(String [] args){
        Customer c1 = new Customer(1,"hanh",50);
        System.out.println(c1.toString());
        System.out.println("ID :" + c1.getID());
        System.out.println("name :" + c1.getName());
        System.out.println("discount :" + c1.getDiscount());
        
        System.out.println("--------------------");
        c1.setDiscount(20);
        System.out.println("ID :" + c1.getID());
        System.out.println("name :" + c1.getName());
        System.out.println("discount :" + c1.getDiscount());
    } 
}
