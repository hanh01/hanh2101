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
public class Point {
    private int x;
    private int y;
    
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
        
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)",x,y);
    }
    
    public int[] getXY(){
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
        
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public double distance(int x,int y){
        int xNew = this.x - x;
        int yNew = this.y - y;
        return Math.sqrt(xNew * xNew + yNew * yNew);
    }
    public double distance(Point another){
        int xNew = this.x - another.x;
        int yNew = this.y - another.y;
        return Math.sqrt(xNew * xNew + yNew * yNew);
    }
    public double distance(){
         return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
