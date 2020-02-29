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
public class testBall {
    public static void main (String [] args){
        Ball b1 = new Ball(0,1,1,2);
        System.out.println(b1);
        System.out.println(b1.getXStep());
        
         System.out.println("---------------");
        b1.setXY(1,2);
        b1.setXYStep(2,3);
        System.out.println(b1);
        System.out.println(b1.move());
        System.out.println(b1.move().move().move());
    }
}
