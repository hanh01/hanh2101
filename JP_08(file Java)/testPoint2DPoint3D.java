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
public class testPoint2DPoint3D {
    public static void main(String [] args){
        Point3D p3 = new Point3D(11.0f,12.0f,13.0f);
        System.out.println(p3);
        Point2D p2 = new Point3D();
        System.out.println(p2);
        System.out.println("X = " + p2.getX());
        System.out.println("Y = " + p2.getY());
        
        System.out.println("------------------------------ ");
        p3.setX(21.0f);
        p3.setY(22.0f);
        p3.setZ(23.0f);
        p2.setXY(10.0f,11.1f);
        p3.setXYZ(1.1f,1.2f,1.3f);
        System.out.println("X = " + p2.getX());
        System.out.println("Y = " + p2.getY());
        System.out.println("Z = " + p3.getZ());
        System.out.println("XY = " + p2.getXY()[1]);
        System.out.println("XYZ = " + p3.getXYZ()[2]);
    }
}
