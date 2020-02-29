/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_03;

/**
 *
 * @author Admin
 */
public class testPoint {
    public static void main(String [] args){
        Point p1 = new Point();
        System.out.println(p1.toString());
        System.out.println(p1.getXY()[1]);
        
        Point p2 = new Point(3,8);
        System.out.println(p2.toString());
        System.out.println(p2.getXY()[1]);
        
        System.out.println("--------------");
        System.out.println(p2.distance(5,8));
        System.out.println(p2.distance(p1));
        
        System.out.println("thay doi gia tri ");
        p2.setXY(2,0);
        System.out.println(p2.distance());
    }
}
