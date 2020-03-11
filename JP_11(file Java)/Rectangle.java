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
public class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double lenght){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length,String color,boolean filled){
        super(color,filled);
        this.length = length;
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double lenght){
        this.length = length;
    }
    
    @Override
    public double getArea(){
        return width * length;
    }
    
    @Override
    public double getPerimeter(){
        return (width + length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + "," + width + ", " + length + "]";
    }
    
    
}
