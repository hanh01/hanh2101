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
public class testMyPoint {
    public static void main(String [] args){
    MyPoint m1 = new MyPoint();
        System.out.println(m1.toString());
        System.out.println(m1.getXY()[1]);
        
        MyPoint p2 = new MyPoint(3,8);
        System.out.println(p2.toString());
        System.out.println(p2.getXY()[1]);
        
        System.out.println("--------------");
        System.out.println(p2.distance(5,8));
        System.out.println(p2.distance(m1));
        
        System.out.println("thay doi gia tri ");
        p2.setXY(2,0);
        System.out.println(p2.distance());
    }    
}
