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
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriangle(int x1, int y1,int x2, int y2,int x3, int y3){
        v1 = new MyPoint(x1,y1); 
        v2 = new MyPoint(x2,y2);
        v3 = new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + ']';
    }
    
    public double getPerimeter(){
         double a,b,c;
         a = Math.sqrt(Math.pow((v2.getX() - v1.getX()),2) + Math.pow((v2.getY() - v1.getY()),2));
         b = Math.sqrt(Math.pow((v3.getX() - v2.getX()),2) + Math.pow((v3.getY() - v2.getY()),2));
         c = Math.sqrt(Math.pow((v1.getX() - v3.getX()),2) + Math.pow((v1.getY() - v3.getY()),2));
         return a + b + c;
    }
    
    public String getType(){
        double a,b,c;
         a = Math.sqrt(Math.pow((v2.getX() - v1.getX()),2) + Math.pow((v2.getY() - v1.getY()),2));
         b = Math.sqrt(Math.pow((v3.getX() - v2.getX()),2) + Math.pow((v3.getY() - v2.getY()),2));
         c = Math.sqrt(Math.pow((v1.getX() - v3.getX()),2) + Math.pow((v1.getY() - v3.getY()),2));
         
         if(a == b && b == c && a == c){
             System.out.println("Equilateral");
             if(a == b || b == c || a == c){
                 System.out.println("Isosceles");
                 if(a!= b || b!= c || c!= a ){
                     System.out.println("Scalene");
                 }  
             }
         }
            return null; 
    }
   
    
}
