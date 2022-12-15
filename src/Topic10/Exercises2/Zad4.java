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
public class Zad4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        for(int i = 2; i < n; i++) {
            if(isSimple(i)) {
                System.out.println(i);
            }
        }
        
        if(isSuperSimple(n)) {
            System.out.println("The number n is super simple");
        }
        else {
            System.out.println("The number n is not super simple");
        }
    }
    
    public static boolean isSimple(int x) {
        int counter = 0;
        x = Math.abs(x);
        
        for(int i = 1; i <= x; i++) {
            if(x % i == 0) counter++;
        }
        
        return counter == 2;
    }
    
    public static boolean isSuperSimple(int x) {
        boolean isSuperSimple = true;
        
        while(x > 0) {
            if(isSimple(x)) {
                x /= 10;
                continue;
            }
            else{
                isSuperSimple = false;
                break;
            }
        }
        return isSuperSimple;
    }
}
