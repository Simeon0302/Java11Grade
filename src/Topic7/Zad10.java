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
public class Zad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] arr1 = sc.nextLine().toCharArray();
        char[] arr2 = sc.nextLine().toCharArray();
        
        for(int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            if(arr1[i] < arr2[i]) {
                System.out.println("The first array");
                break;
            }
            else {
                System.out.println("The second array");
                break;
            }
        }
    }
}
