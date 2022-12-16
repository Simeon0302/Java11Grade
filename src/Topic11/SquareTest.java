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
public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();

        Scanner sc = new Scanner(System.in);
        square.setSideSize(sc.nextInt());

        System.out.println(square.print());
    }
}
