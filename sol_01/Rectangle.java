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
public class Rectangle {
    private float length;
    private float width;
    
    public Rectangle(){
        length = 2.0f;
        width = 1.0f;
    }
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    public float getLength1(){
        return length;
    }
    public void setLength(float length){
        this.length = length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(){
        return length * width ;
    }
    public double getPerimeter(){
        return (length + width) * 2 ;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
    
}
