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
public class Point2D {
    private float x;
    private float y;
    
    public Point2D(){
        x = 0.0f;
        y = 0.0f;
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return this.y;
    }
    public void setY(float y){    
        this.y = y;
    }
    public float[] getXY(){
        float[] XY = new float[2];
        XY[0] = this.getX();
        XY[1] = this.getY();
        return XY;
    }
    public void setXY(float x,float y){
        this.x = x ;
        this.y = y;
    }
    

    @Override
    public String toString() {
        return "("  + x + "," + y + ")"  ;
    }            
    
    
}
    
    
    
