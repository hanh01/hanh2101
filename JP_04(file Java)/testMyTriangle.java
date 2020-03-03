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
public class testMyTriangle {
    public static void main(String [] args){
        MyTriangle mt1 = new MyTriangle(1,1,1,1,1,1);
        System.out.println(mt1.toString());
        System.out.println(mt1.getType());
        System.out.println(mt1.getPerimeter());
       
    }
}
