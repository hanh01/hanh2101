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
public class testCircle {
    public static void main(String [] args){
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
        System.out.println(c1.getRadius1());
        
        c1.setRadius(3.1);
        c1.setColor("red");
        System.out.println("color :" + c1.getColor());
        System.out.println("radius : " + c1.getRadius1());
        System.out.println(c1.getArea());
        
        System.out.println("------------------------");
        Circle c2 = new Circle(4.1);
        System.out.println(c2.toString());
        System.out.println("Color :" + c2.getColor());
        System.out.println(c2.getArea());
    }
}
