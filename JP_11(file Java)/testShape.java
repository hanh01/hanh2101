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
public class testShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5,"red",false);
        System.out.println(s1);
        System.out.println("Area :" + s1.getArea());
        System.out.println("Color :" + s1.getColor());
        System.out.println("Perimeter :" + s1.getPerimeter());
        System.out.println("Filled :" + s1.isFilled());
        
        System.out.println("");
        Circle c = (Circle)s1;
        System.out.println(c);
        System.out.println("Radius :" + c.getRadius());
        
        
        System.out.println("------------------------------ ");
        Shape s2 = new Rectangle(1.0,2.0,"green",false);
        System.out.println(s2);
        System.out.println("Area :" + s2.getArea());
        System.out.println("Color :" + s2.getColor());
        System.out.println("Perimeter :" + s2.getPerimeter());
        
        System.out.println("");
        Rectangle r = (Rectangle)s2;
        System.out.println(r);
        System.out.println("Area :" + r.getArea());
        System.out.println("width :" + r.getWidth());
        System.out.println("length :" + r.getLength());
         
        
        System.out.println("------------------------------ "); 
        Shape s3 = new Square(5.0);
        System.out.println(s3);
        System.out.println("Area :" + s3.getArea());
        System.out.println("Color :" + s3.getColor());
        
        System.out.println("");
        Square square = (Square)s3;
        square.setWidth(2.0); 
        System.out.println("Side :" + square.getSide());
        
        
        System.out.println("------------------------------ "); 
        Rectangle r2 = (Rectangle)s3;
        System.out.println("Width :" + r2.getWidth());
        System.out.println("Length :" + r2.getLength());
        
        
        System.out.println("------------------------------ "); 
        Rectangle rr = (Rectangle)square;
        System.out.println("Area :" + rr.getArea());
        System.out.println("Color :" + rr.getColor());
        System.out.println("Width :" + rr.getWidth());
        System.out.println("Length :" + rr.getLength());
    }
    
}
