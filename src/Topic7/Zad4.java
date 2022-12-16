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
public class Zad4 {
    public static void main(String[] args) {
        String input, res;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        
        res = input.charAt(input.length() - 1) + input.substring(0, input.length() - 1);
        System.out.println(res);
    }
}
