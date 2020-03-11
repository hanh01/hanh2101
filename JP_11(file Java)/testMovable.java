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
public class testMovable {
    public static void main(String [] args){
        Movable m1 = new MovablePoint(5,6,10,15);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        
        System.out.println("");
        Movable m2 = new MovableCircle(1,2,3,4,10);
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);
    }
    
}
