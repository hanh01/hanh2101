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
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(){
        hour = 13;
        minute = 10;
        second = 20;
    }
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour1(){
        return this.hour;
    }
    public void setHour(int hour){
        if(hour >= 0 && hour<= 23){
            this.hour = hour;
        }
        else{
            System.out.println("du lieu khong phu hop");
        }
    }
    
    public int getMinute(){
        return this.minute;
    }
    public void setMinute(int minute){
        if(minute >= 0 && minute<= 59){
            this.minute = minute;
        }
        else{
            System.out.println("du lieu khong phu hop");
        }
    }
    
    public int getSecond(){
        return this.second;
    }
    public void setSecond(int second){
        if(second >= 0 && second<= 59){
            this.second = second;
        }
        else{
            System.out.println("du lieu khong phu hop");
        }
    }
    
    public void setTime(int hour, int minute, int second){
        if(hour >= 0 && hour<= 23){
            this.hour = hour;
        }
        else{
            System.out.println("du lieu khong phu hop");
        }
        if(minute >= 0 && minute<= 59){
            this.minute = minute;
        }
        else{
            System.out.println("du lieu khong phu hop");
        }
         if(second >= 0 && second<= 59){
            this.second = second;
        }
        else{
            System.out.println("du lieu khong phu hop");
        }
    }
    
    public Time nextSecond(){
        second = second +1 ;
        if(second >= 60){
            second = 0;
            minute = minute +1;
            if(minute >=60){
                minute = 0;
                hour = hour + 1;
                if(hour >= 24){
                    hour = 0;
                }
            }
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    
    
}
