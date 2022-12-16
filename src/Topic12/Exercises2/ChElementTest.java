/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic12.Exercises2;

import java.util.Scanner;

/**
 *
 * @author simeonyav
 */
public class ChElementTest {
    public static void main(String[] args) {
        ChElement[] elements = new ChElement[3];
        elements[0] = new ChElement("B", 5, 2, 13.2f);
        elements[1] = new ChElement("Li", 3, 2, 14f);
        elements[2] = new ChElement("O", 8, 2, 35f);
        
        for(int i = 0; i < 3; i++) {
            System.out.println(elements[i].toString());
        }
    }
}
