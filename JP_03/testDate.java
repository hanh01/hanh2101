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
public class testDate {
    public static void main(String [] args){
        Date d1 = new Date(21,01,2001);
        System.out.println("Day :" + d1.getDay1());
        System.out.println("Month :" + d1.getMonth());
        System.out.println("Year :" + d1.getYear());
        
        d1.setDate(27,12,2000);
        System.out.println(d1);
    }
}
