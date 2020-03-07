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
public class Point3D extends Point2D {
    private float z ;
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z = z;
    }
    public Point3D(){
        z = 0.0f;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public float[] getXYZ(){
        float[] XYZ = new float[3];
        XYZ[0] = super.getX();
        XYZ[1] = super.getY();
        XYZ[2] = this.getZ();
        return XYZ;
    }
    
    public void setXYZ(float x,float y,float z){
        super.getX();
        super.getY();
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + super.getX()  + "," + super.getY() + "," + z + ')';
    }
    
    
}
