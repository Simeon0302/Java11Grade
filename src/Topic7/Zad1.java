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
public class Zad1 {
    public static void main(String[] args) {
        String str1, str2;
        int index;
        Scanner sc = new Scanner(System.in);
        
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        
        index = str1.indexOf(str2);
        if(index != -1) {
            System.out.println(index);
        }
    }
}
