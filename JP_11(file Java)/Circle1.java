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
public class Circle1 implements GeometricObject {
     double radius;
    
    public Circle1(){
        radius = 1.0;
    }
    public Circle1(double radius){
        this.radius = radius;
    }
    public double getRadius1(){
        return this.radius;
    }

    @Override
    public String toString() {
        return "Circle1{" + "radius=" + radius + '}';
    }
    
    @Override
    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }
    @Override
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
