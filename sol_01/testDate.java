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
public class testDate {
    public static void main(String [] args){
        Date d1 = new Date();
        System.out.println(d1.toString());
        System.out.println("Day :" + d1.getDay1());
        System.out.println("Month :" + d1.getMonth());
        System.out.println("Year :" + d1.getYear());
        
         System.out.println("----------------------");
        d1.setDay(27);
        d1.setMonth(12);
        d1.setYear(2000);
        System.out.println("Day :" + d1.getDay1());
        System.out.println("Month :" + d1.getMonth());
        System.out.println("Year :" + d1.getYear());
        
        System.out.println("----------------------");
        d1.setDate(9,1,2001);
        System.out.println(d1.toString());
    }
}
