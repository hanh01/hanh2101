/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

import JP_08.Cylinder;

/**
 *
 * @author Admin
 */
public class testCylinder {
    public static void main(String[] args){
        Cylinder c1 = new Cylinder();
        System.out.println("Radius is :" + c1.getRadius()
            + " ,Height is :"  + c1.getHeight()  
            + " ,Color is :"  + c1.getColor()
            + " ,Base area is :"  + c1.getArea()
            + " ,Volume is :"  + c1.getVolume());
        
        Cylinder c2 = new Cylinder(5.0, 2.0);
        System.out.println("Radius is :" + c1.getRadius()
            + " ,Height is :"  + c2.getHeight()  
            + " ,Color is :"  + c2.getColor()
            + " ,Base area is :"  + c2.getArea()
            + " ,Volume is :"  + c2.getVolume());
    }
}
