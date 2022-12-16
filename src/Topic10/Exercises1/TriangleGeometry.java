/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic10.Exercises1;

import java.util.Scanner;

/**
 *
 * @author Moni
 */
public class TriangleGeometry {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        if(isTriangle(a, b, c)) {
            System.out.println("The triangle exists");
            System.out.printf("The perimeter of the triangle is %.2f", getPerimeter(a, b, c));
            System.out.printf("The are of the triangle is %.2f", getArea(a, b, c));
            
            System.out.printf("The length of Ha is %.2f", getHa(a, b, c));
            System.out.printf("The length of Hb is %.2f", getHa(b, a, c));
            System.out.printf("The length of Hc is %.2f", getHa(c, a, b));
            
            System.out.printf("The length of Ma is %.2f", getMa(a, b, c));
            System.out.printf("The length of Mb is %.2f", getMa(a, b, c));
            System.out.printf("The length of Mc is %.2f", getMa(c, a, b));
            
            System.out.printf("The length of La is %.2f", getLa(a, b, c));
            System.out.printf("The length of Lb is %.2f", getLa(b, a, c));
            System.out.printf("The length of Lc is %.2f", getLa(c, a, b));
        }
        else {
            System.out.println("The triangle does not exist");
        }
    }
    
    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
    
    public static double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }
    
    public static double getArea(double a, double b, double c) {
        double p = getPerimeter(a, b, c) / 2;
        
        return Math.sqrt(p * (p - a) *(p - b) * (p - c));
    }
    
    public static double getHa(double a, double b, double c) {
        return Math.sqrt(Math.pow(a / 2, 2) + Math.pow(b, 2));
    }
    
    public static double getMa(double a, double b, double c) {
        return Math.sqrt((2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(a, 2)) / 4);
    }
    
    public static double getLa(double a, double b, double c) {
        double m = (a * b) / (b + c);
        double n = (a * c) / (b + c);
        return (b * c) - (m * n);
    }
}
