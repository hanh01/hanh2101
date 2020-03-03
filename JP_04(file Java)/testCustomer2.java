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
public class testCustomer2 {
    public static void main(String [] args){
        Customer2 cs1 = new Customer2(1,"abc",'m');
        System.out.println(cs1.toString());
        System.out.println("ID :" + cs1.getID());
        System.out.println("Name :" + cs1.getName());
        System.out.println("Gender :" + cs1.getGender());
    }
}
