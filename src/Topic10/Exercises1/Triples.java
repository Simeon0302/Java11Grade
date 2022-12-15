/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic10.Exercises1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author simeonyav
 */
public class Triples {
    
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        System.out.println("Min number is " + getMin3(a, b, c));
        System.out.println("Max number is " + getMax3(a, b, c));
        System.out.println(isIncreasing(a, b, c) ? "The numbers are increasing" : "The numbers are not increasing");
        System.out.println(isDecreasing(a, b, c) ? "The numbers are decreasing" : "The numbers are not decreasing");
        System.out.println(isEquals(a, b, c) ? "Numbers are equal" : "Numbers are not equal");
        System.out.println(isPythagorean(a, b, c) ? "The numbers are pythagorean" : "The numbers are not pythagorean");
        System.out.println("The volume of the figure is " + getVolume(a, b, c));
        
    }
    
    public static int getMin3(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    
    public static int getMax3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    public static boolean isIncreasing(int a, int b, int c) {
        return a > b ? b > c : false;
    }
    
    public static boolean isDecreasing(int a, int b, int c) {
        return a < b ? a < c : false;
    }
    
    public static boolean isEquals(int a, int b, int c) {
        return a == b ? a == c : false;
    }
    
    public static boolean isPythagorean(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return Math.pow(arr[0], 2) + Math.pow(arr[1], 1) == Math.pow(arr[2], 2);
    }
    
    public static double getVolume(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 ? a * b * c : 0;
    }
}
