/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

/**
 *
 * @author Admin
 */
public class testPointMovablePoint {
    public static void main(String [] args){
        Point p = new Point(1,2);
        System.out.println(p);
        
        MovablePoint m = new MovablePoint(12,13);
        System.out.println(m);
        m.setSpeed(10,15);
        System.out.println("getSpeed :" + m.getSpeed()[0]);
    }
}
