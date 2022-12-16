/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Topic11;

import java.util.Scanner;

/**
 *
 * @author simeonyav
 */
public class MenuTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        menu.func(sc.nextInt());
    }
}
