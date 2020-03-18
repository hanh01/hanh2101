package Java2_02;
import lab02.Temperature;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Java.Array.getAverage;
import static Java.Array.initArray;

public class Temprature {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int sum = 0;
        double average = 0.0;

        int[] a =   initArray(5);
       for(int i=0;i< a.length; i++) {
            System.out.println("Element " + i + " , " + "typed value was " + a[i]);
            sum = sum + a[i];
            average = (double)sum/a.length;
        }
        System.out.println("Average is : " + average);


        int count = 0;
        for(int i = 0; i<a.length;i++){
            if(a[i] > average){
                count ++;
            }
        }
        System.out.println("Have "+ count +" days higher than average");


    }
}
