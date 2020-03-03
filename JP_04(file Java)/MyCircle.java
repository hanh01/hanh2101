/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_04;

/**
 *
 * @author Admin
 */
public class MyCircle {
    private  MyPoint center;
    private int radius;
    
    public MyCircle(){
        center = new MyPoint(0,0);
        radius = 1;
    }
    public MyCircle(int x, int y, int radius){
       this.center = new MyPoint(x,y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    public int getRadius(){
        return this.radius ;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public MyPoint getCenter(){
       return this.center;
    }
    public void setCenter(MyPoint center){
        this.center = center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenter(int x){
       x = center.getX();
    }
    public int getCenterY(){
        return center.getY();
    } 
    public void setCenterY(int y){
        y = center.getY();
    }
    public int[] getCenterXY(){
        int [] CenterXY = new int[2];
        CenterXY[1] = center.getX();
        CenterXY[2] = center.getY();
        return CenterXY;
    }
    public void setCenterXY(int x, int y){
         x = center.getX();
         y = center.getY();
    }  

    @Override
    public String toString() {
        return "MyCircle[" + "center=" + center + ", radius=" + radius + ']';
    }
    
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return radius *2 * Math.PI;
    }
    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}
