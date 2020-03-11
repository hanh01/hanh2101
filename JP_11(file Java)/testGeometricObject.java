/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_11;

/**
 *
 * @author Admin
 */
public class testGeometricObject {
    public static void main(String [] args){
        GeometricObject g = new Circle1();
        System.out.println(g);
        System.out.println("Area : " + g.getArea());
        System.out.println("Perimeter : " + g.getPerimeter());
        
        
        System.out.println("");
        Circle1 c1 = new ResizableCircle(2.0);
        System.out.println(c1);
        System.out.println("Radius : " + c1.getRadius1());
        System.out.println("Area : " + c1.getArea());
        System.out.println("Perimeter : " + c1.getPerimeter());
        
        System.out.println("");
        ResizableCircle r = (ResizableCircle)c1; 
        System.out.println("Radius 2 : " + r.resize(10));
        
        System.out.println("");
        Resizable r2 = new ResizableCircle(20);
        System.out.println("Radius : " + r2.resize(10));
    }

}
