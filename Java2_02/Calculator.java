package Java2_02;

import JP_09.C;


import java.util.Scanner;
import static Java.Array.getAverage;
import static Java.Array.initArray;

public class Calculator {
    private static Scanner scanner = new Scanner(System.in);
    public static double getAverage(int [] array){
        int sum =0;
        double average = 0.0;
        for(int i=0;i< array.length; i++) {
            sum = sum + array[i];
            average = (double)sum/array.length;
        }
        return average;
    }

    public static void main(String[] args){
        int[] x =  initArray(5);
        for(int i=0;i< x.length; i++) {
            System.out.println("Element " + i + " , " + "typed value was " + x[i]);
        }
        System.out.println("Average is : " + getAverage(x));
    }

}
