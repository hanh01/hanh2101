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
public class Circle {
    private String color;
    private double radius;
    
    public Circle(){
        color ="blue";
        radius = 5.0 ;
    }
    public Circle(String color){
        this.color = color;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle (String color ,double radius){
        this.color = color;
        this.radius = radius;
    }
    
    public double getRadius1(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
      return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "color=" + color + ", radius=" + radius + '}';
    }
    
   
}
