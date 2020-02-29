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
public class Ball {
    private double x;
    private double y;
    private double xStep;
    private double yStep;
    
    public Ball(double x, double y, double xStep,double yStep){
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
    }
    public double getX(){
        return this.x;
    }
    public void setX(double x){
        this.x = x;
    }
    
    public double getY(){
        return this.y;
    }
    public void setY(double y){
        this.y = y;
    }
    
    public double getXStep(){
        return this.xStep;
    }
    public void setXStep(double xStep){
        this.xStep = xStep;
    }
    
    public double getYStep(){
        return this.yStep;
    }
    public void setYStep(double yStep){
        this.yStep = yStep;
    }

    @Override
    public String toString() {
        return "Ball@(" + x + "," + y + ")" + "," + "Speed = (" + this.xStep +"," + this.yStep + ")" ; 
    }
    
    public double[] getXY(){
        double[] results = new double[2];
        results[1] = this.x;
        results[2] = this.y;
        return results;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double[] getXYStep(){
        double[] results = new double[2];
        results[1] = this.xStep;
        results[2] = this.yStep;
        return results;
    }
    public void setXYStep(double xStep, double yStep){
        this.xStep = xStep;
        this.yStep = yStep;
    }
    
    public Ball move(){
        x = x + xStep;
        y = y + yStep;
        return this;
    }
       
}
