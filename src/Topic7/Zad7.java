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
public class Zad7 {
    public static void main(String[] args) {
        int n;
        String res = "";
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            res = res.concat(String.valueOf(i));
        }
        
        System.out.println(res);
    }
}
