/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic10.Exercises2;

import java.util.Scanner;

/**
 *
 * @author Moni
 */
public class Zad3 {
    public static void main(String[] args) {
        int n, counter = 0, num;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            num = sc.nextInt();
            if(is_simple(num)) counter++;
        }
        
        System.out.println(counter);
    }
    
    public static boolean is_simple(int x) {
        int counter = 0;
        x = Math.abs(x);
        
        for(int i = 1; i <= x; i++) {
            if(x % i == 0) counter++;
        }
        
        return counter == 2;
    }
}
