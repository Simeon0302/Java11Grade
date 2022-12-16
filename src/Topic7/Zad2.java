/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic7;

import java.util.Scanner;

/**
 *
 * @author Moni
 */
public class Zad2 {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        
        input = sc.nextLine();
        
        if(input.equals("Java")) {
            System.out.println("Good choice!");
        }
        else {
            System.out.println("Try again!");
        }
    }
}
