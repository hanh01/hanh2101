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
public class testCircle2 {
    public static void main (String [] args){
        Circle2 c1 = new Circle2();
        System.out.println(c1.toString());
        System.out.println("radius : " + c1.getRadius1());
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        
        System.out.println("----------------------");
        c1.setRadius(2.1);
        System.out.println("radius 2 : " + c1.getRadius1());
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        
    }
}
