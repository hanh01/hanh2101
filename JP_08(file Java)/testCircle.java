/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

import JP_08.Circle;

/**
 *
 * @author Admin
 */
public class testCircle {
    public static void main(String [] args){
        Circle c = new Circle();
        System.out.println("Color :" + c.getColor());
        System.out.println("Radius :" + c.getRadius());
        System.out.println("Area :" + c.getArea());
    }
}
