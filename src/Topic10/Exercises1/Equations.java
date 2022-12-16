/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic10.Exercises1;

import java.util.Scanner;

/**
 *
 * @author simeonyav
 */
public class Equations {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if(a == 0) {
            solutionsLinear(b, c);
        }
        else {
            solutionsQuadratic(a, b, c);
        }
    }
    
    public static void solutionsLinear(int a, int b) {
        System.out.println(-b / a);
    }
    
    public static void solutionsQuadratic(int a, int b, int c) {
        int determinanta = (b * b) - (4 * a * c);
        double sqrDeterminanta = Math.sqrt(determinanta);
        if(Double.isNaN(sqrDeterminanta)) {
            System.out.println("There are no solutions");
        }
        else {
            double x1 = (-b + sqrDeterminanta) / (2 * a);
            double x2 = (-b - sqrDeterminanta) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
