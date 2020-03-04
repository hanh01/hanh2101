/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_05;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class CircleComputation {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        double radius,diameter,area,circumference;
        double surfaceArea,volume,baseArea ;
        System.out.println("Radius:");
        radius = in.nextDouble();
        
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
        circumference = 2* Math.PI * radius;
        
        System.out.format("diameter : %.2f%n", diameter );
        System.out.format("area : %.2f%n", area );
         System.out.format("circumference : %.2f%n",circumference );
    }
}
