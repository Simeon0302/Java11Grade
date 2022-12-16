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
public class Zad9 {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        
        input = sc.nextLine();
        String[] arr = input.split(", ");
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
