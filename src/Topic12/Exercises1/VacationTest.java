/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic12.Exercises1;

import java.util.Scanner;

/**
 *
 * @author simeonyav
 */
public class VacationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Vacation vacation1 = new Vacation();
        Vacation vacation2 = new Vacation(sc.nextInt(), sc.next(), sc.nextFloat());
        Vacation vacation3 = new Vacation(vacation2);
        
        System.out.println(vacation1.toString());
        System.out.println(vacation2.toString());
        System.out.println(vacation3.toString());
    }
}
