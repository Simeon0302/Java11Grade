/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic10.Exercises2;

import java.util.Scanner;

/**
 *
 * @author simeonyav
 */
public class Zad1 {
    public static int sum_digit(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
    
        if(sum_digit(a) + sum_digit(b) == sum_digit(c) + sum_digit(d)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
