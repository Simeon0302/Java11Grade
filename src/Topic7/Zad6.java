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
public class Zad6 {
    public static void main(String[] args) {
        String name1, name2;
        int sum1 = 0, sum2 = 0;
        Scanner sc = new Scanner(System.in);
        
        name1 = sc.nextLine();
        name2 = sc.nextLine();
        
        for(int i = 0; i < name1.length(); i++) {
            char letter = name1.charAt(i);
            if(letter != ' ') {
                sum1 += (int) letter;
            }
        }
        
        for(int i = 0; i < name2.length(); i++) {
            char letter = name2.charAt(i);
            if(letter != ' ') {
                sum2 += (int) letter;
            }
        }
        
        if(sum1 > sum2) {
            System.out.println(name1);
        }
        else {
            System.out.println(name2);
        }
    }
}
