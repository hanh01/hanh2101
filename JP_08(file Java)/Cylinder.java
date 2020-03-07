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
public class Cylinder extends Circle {
    private double height;
    
    public Cylinder(){
        super();
        this.height = 1.0;
        System.out.println("contructed a Cylinder with Cylinder()");
    }
    public Cylinder(double height){
        super();
        this.height = height;
        System.out.println("contructed a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height,double radius){
        super(radius);
        this.height = height;
        System.out.println("contructed a Cylinder with Cylinder(height,radius)");
    }
    public Cylinder(double height,double radius,String color){
        super(color, radius);
        this.height = height;
        System.out.println("contructed a Cylinder with Cylinder(height,radius,color)");
    }
    public double getHeight(){
        return this.height;
    } 
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return this.height;
    }

    @Override
    public String toString() {
        return "This is a Cylinder";
    }
    
    
    
}
