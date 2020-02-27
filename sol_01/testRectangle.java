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
public class testRectangle {
    public static void main (String [] args){
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        System.out.println("Area :" + r1.getArea());
        System.out.println("Perimeter :" + r1.getPerimeter());
        
        System.out.println("---------------------------------");
        r1.setLength(3.0f);
        r1.setWidth(2.0f);
        System.out.println(r1.toString());
        System.out.println("Area :" + r1.getArea());
        System.out.println("Perimeter :" + r1.getPerimeter());
    }
}
