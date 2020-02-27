/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol_01;

/**
 *
 * @author Admin
 */
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(){
        day = 21;
        month = 01;
        year = 2001;
    }
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay1(){
        return this.day;
    }
    public void setDay(int day){
        if(day >= 1 && day<= 31){
            this.day = day;
        }
        else{
            System.out.println("du lieu khong phu hop");
        }
    }
    
    public int getMonth(){
        return this.month;
    }
    public void setMonth(int month){
        if(month >= 1 && month<= 12){
            this.month = month;
        }
        else{
            System.out.println("du lieu khong phu hop");
        }
    }
    
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        if(year >= 1900 && year<= 9999){
        this.year = year;    
        }
        else{
            System.out.println("du lieu khong phu hop");
        }  
    }
    
    
    public void setDate(int day, int month, int year){
        if(day >= 1 && day<= 31){
            this.day = day;
        }
        else{
            System.out.println("du lieu khong phu hop");
        }
        if(month >= 1 && month<= 12){
            this.month = month;
        }
        else{
            System.out.println("du lieu khong phu hop");
        }
         if(year >= 1900 && year<= 9999){
        this.year = year;    
        }
        else{
            System.out.println("du lieu khong phu hop");
        }  
 
    }

    @Override
    public String toString() {
        return "Date{"  + day + "/" + month + "/" + year + '}';
    }
    
    
}
