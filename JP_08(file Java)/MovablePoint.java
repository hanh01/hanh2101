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
public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }
    public float getXSpeed(){
        return this.xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getYSpeed(){
        return this.ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] speed = new float[2];
        speed[0] = this.getXSpeed();
        speed[1] = this.getYSpeed();
        return speed;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "),speed = (" + xSpeed + "," + ySpeed + ")"; 
    }
    
  
     
}
