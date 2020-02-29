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
public class testTime {
     public static void main (String [] args){
        Time t1 = new Time();
        System.out.println(t1.toString());
        System.out.println("Hour :" + t1.getHour1());
        System.out.println("Minute :" + t1.getMinute());
        System.out.println("Second :" + t1.getSecond());
        
        
        System.out.println("----------------------");
        t1.setHour(10);
        t1.setMinute(10);
        t1.setSecond(10);
        System.out.println("Hour :" + t1.getHour1());
        System.out.println("Minute :" + t1.getMinute());
        System.out.println("Second :" + t1.getSecond());
        
        System.out.println("----------------------");
        t1.setTime(07,50,59);
        System.out.println(t1.toString());
        System.out.println(t1.nextSecond());
        
    }
}
