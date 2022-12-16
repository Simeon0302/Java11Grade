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
public class Zad2 {
    public static void main(String[] args) {
        int num = 1;
        Scanner sc = new Scanner(System.in);
    
        num = sc.nextInt();
        while(num != 0) {
            System.out.println(count_digit(num));
            num = sc.nextInt();
        }
    }    
    public static int count_digit(int n) {
        int counter = 0;
        while(n > 0) {
            counter++;
            n /= 10;
        }
        
        return counter;
    }
}
