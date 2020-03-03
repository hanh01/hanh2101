/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_04;

/**
 *
 * @author Admin
 */
public class testMyCircle {
    public static void main (String [] args){
       MyPoint mp1 = new MyPoint(1,2);
       MyPoint mp2 = new MyPoint(2,4);
    
       MyCircle m1 = new MyCircle(mp1,3);
       System.out.println(m1.toString()); 
      System.out.println("Center" + m1.getCenter());
      System.out.println(" x =" + m1.getCenterX());
      System.out.println(" y =" + m1.getCenterY());
      System.out.println("radius =" + m1.getRadius());
      System.out.println("Area =" + m1.getArea());
      System.out.println("Circumference =" + m1.getCircumference());
      
      System.out.println("-----------------------------------");
      mp1.setXY(2,3);
      System.out.println("Center" + m1.getCenter());
      System.out.println(" x =" + m1.getCenterX());
      System.out.println(" y =" + m1.getCenterY());
      System.out.println("radius =" + m1.getRadius());
      System.out.println("Area =" + m1.getArea());
      System.out.println("Circumference =" + m1.getCircumference());
      
      MyCircle m2 = new MyCircle(mp2,4);
      System.out.println( m1.distance(m2));
    }
    
}
